SUMMARY = "A simple Python API for Bluetooth D-Bus calls"
DESCRIPTION = "Allows easy pairing, connecting and scanning. Also provides a TCP-to-RFCOMM socket bridge for data transfer."
HOMEPAGE = "https://github.com/emlid/bluetool"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4fe869ee987a340198fb0d54c55c47f1"

inherit pypi setuptools

SRC_URI = "https://github.com/emlid/bluetool/archive/refs/tags/${PV}.tar.gz"

SRC_URI[md5sum] = "1c0d64032af61e403963b88486957c69"
SRC_URI[sha256sum] = "91b2ee9e54fe7df2150edef5b4149495251636e77d6cdd3be457faea04433ccb"

RDEPENDS_${PN} = "python-dbus python-tcpbridge python-pygobject"

include python-package-split.inc
