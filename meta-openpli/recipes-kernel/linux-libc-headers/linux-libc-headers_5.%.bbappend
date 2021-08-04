FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = "\
	file://audio_video_ioctl.patch \
	file://fsxattr.patch \
	file://dmx_set_source.patch \
"
