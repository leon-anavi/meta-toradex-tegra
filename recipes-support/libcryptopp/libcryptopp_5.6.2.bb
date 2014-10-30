DESCRIPTION = "A free C++ class library of cryptographic schemes"
HOMEPAGE = "http://www.cryptopp.com/wiki/Main_Page"
BUGTRACKER = "http://sourceforge.net/apps/trac/cryptopp/"
SECTION = "libs"

LICENSE = "PD"
LIC_FILES_CHKSUM = "file://License.txt;md5=15bb91b85c60bac932e0a3f550bad6a3"

BBCLASSEXTEND = "native nativesdk"

PR = "r1"

PVSHORT = "${@'${PV}'.replace('.','')}"
SRC_URI = "${SOURCEFORGE_MIRROR}/cryptopp/${PV}/cryptopp${PVSHORT}.zip \
	    file://makefile_fix_destdir.patch \
          "
SRC_URI[md5sum] = "7ed022585698df48e65ce9218f6c6a67"
SRC_URI[sha256sum] = "5cbfd2fcb4a6b3aab35902e2e0f3b59d9171fee12b3fc2b363e1801dfec53574"

#S = "${WORKDIR}/libcryptopp-${PV}"
S = "${WORKDIR}"

inherit autotools pkgconfig

EXTRA_OECONF = "--libdir=${base_libdir}"

do_compile() {
	sed -i -e 's/^CXXFLAGS/#CXXFLAGS/' GNUmakefile
	export CXXFLAGS="${CXXFLAGS} -DNDEBUG -fPIC"
	oe_runmake -f GNUmakefile
	oe_runmake libcryptopp.so
}
