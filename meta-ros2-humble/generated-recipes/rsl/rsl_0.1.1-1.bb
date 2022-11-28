# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "ROS Support Library"
AUTHOR = "Tyler Weaver <maybe@tylerjw.dev>"
ROS_AUTHOR = "Tyler Weaver <maybe@tylerjw.dev>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=4633480cdd27d7906aaf3ef4b72014b2"

ROS_CN = "rsl"
ROS_BPN = "rsl"

ROS_BUILD_DEPENDS = " \
    libeigen \
    tl-expected \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    git-native \
"

ROS_EXPORT_DEPENDS = " \
    libeigen \
    tl-expected \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libeigen \
    tl-expected \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-range-v3} \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/PickNikRobotics/RSL-release/archive/release/humble/rsl/0.1.1-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/rsl"
SRC_URI = "git://github.com/PickNikRobotics/RSL-release;${ROS_BRANCH};protocol=https"
SRCREV = "3d9b02a52e450799681200288c0750522b6f7a28"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}