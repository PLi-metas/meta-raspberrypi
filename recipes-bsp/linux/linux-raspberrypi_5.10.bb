require linux-raspberrypi.inc

LINUX_VERSION = "${KERNELVERSION}"

SRCREV = "5a11bfe181012880ca5c0d76ed641c30116e47e1"

S_rpi = "${WORKDIR}/linux-${SRCREV}"

SRC_URI[md5sum] = "1b3389b371e4050cb90392d44423d50c"
SRC_URI[sha256sum] = "3d5ac4293f56a3789596db347489749ea6efa4fc01cc938a1248648eaecccb87"
