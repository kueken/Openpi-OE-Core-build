GST_VERSION_FULL = "1.18.4"

inherit gitpkgv meson gettext

PV = "${GST_VERSION_FULL}+git${SRCPV}"
PKGV = "${GST_VERSION_FULL}+git${GITPKGV}"

SRCREV_gst = "53c68d92d8e158b9b7d9d26baaf14214e462c451"
SRCREV_gst_libav = "0d9554d95b08d54a3ae126bb0a6189dfa708cf7e"

SRCREV_gst_plugins_bad = "e9201ea6ad577dd65b7d993b1347bf062c788c6d"
SRCREV_gst_plugins_base = "61e8ba683538e3bc4525fd7a7a062d0507593c0d"
SRCREV_gst_plugins_good = "723f0efc233612cce8a0a7f46656aceb8ce7c301"
SRCREV_gst_plugins_ugly = "b9b5c66e7842757720d7ca79005eb56e8cea453d"

S = "${WORKDIR}/git"
