# T20/T30: build it only for OpenGL ES on top of X11
PACKAGECONFIG_tegra = "x11-gles2"
PACKAGE_ARCH_tegra = "${MACHINE_ARCH}"

# TK1: build it only for OpenGL & OpenGL ES on top of X11
PACKAGECONFIG_tegra124 = "x11-gl x11-gles2"
PACKAGE_ARCH_tegra124 = "${MACHINE_ARCH}"
