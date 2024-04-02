# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Provides custom message, srv and action types for psdk ros2 wrapper"
AUTHOR = "Bianca Bendris <bianca@unmanned.life>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=1e6edcdce62cccda22710dc9415f3477"

ROS_CN = "psdk_ros2"
ROS_BPN = "psdk_interfaces"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    std-msgs \
    std-srvs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/psdk_ros2-release/archive/release/humble/psdk_interfaces/1.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/psdk_interfaces"
SRC_URI = "git://github.com/ros2-gbp/psdk_ros2-release;${ROS_BRANCH};protocol=https"
SRCREV = "eeefbc6c6ee976cb4c9101eeb3fc0f3e5891b095"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
