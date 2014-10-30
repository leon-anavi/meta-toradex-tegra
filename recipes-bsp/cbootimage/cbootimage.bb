SUMMARY = "cbootimage"
DESCRIPTION = "Utility to create boot images with boot configuration data (BCT) for NVIDIA Tegra SoCs."
SECTION = "bootloader"
DEPENDS = ""

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

BBCLASSEXTEND = "native nativesdk"

SRC_URI = "git://github.com/NVIDIA/cbootimage.git \
	  "
SRCREV = "57f67537af9cdf34ae9edb76f351c7df277a55b4"
PV = "1.4"

EXTRA_OEMAKE='PREFIX="${prefix}" LIBDIR="${libdir}"'

S = "${WORKDIR}/git"

inherit autotools

