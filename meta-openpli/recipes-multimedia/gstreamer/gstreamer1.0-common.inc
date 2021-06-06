GST_VERSION_FULL = "1.18.4"

inherit gitpkgv meson gettext

PV = "${GST_VERSION_FULL}+git${SRCPV}"
PKGV = "${GST_VERSION_FULL}+git${GITPKGV}"

SRCREV_gst = "53c68d92d8e158b9b7d9d26baaf14214e462c451"
SRCREV_gst_libav = "0d9554d95b08d54a3ae126bb0a6189dfa708cf7e"

SRCREV_gst_plugins_bad = "33468eb32f11fb45363acd3396d38dde313eb2a4"
SRCREV_gst_plugins_base = "5f11694ac757917bc94278c1eafdf819d6b56674"
SRCREV_gst_plugins_good = "beba0254d8aa60f5f03eedacaec2955a6c896c31"
SRCREV_gst_plugins_ugly = "b9b5c66e7842757720d7ca79005eb56e8cea453d"

S = "${WORKDIR}/git"
