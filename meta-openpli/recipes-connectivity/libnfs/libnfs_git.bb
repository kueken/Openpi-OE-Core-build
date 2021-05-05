SUMMARY = "NFS client library"

LICENSE = "LGPLv2.1 & GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=825301ba17efc9d188ee0abd4b924ada"

PV = "4.0.0+git"
SRCREV = "a7c66379804629ad1e787e8e4cb256238259c7fe"

SRC_URI = "git://github.com/sahlberg/libnfs.git;protocol=https"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE = "-DBASE_LIB_PATH=${baselib}"
