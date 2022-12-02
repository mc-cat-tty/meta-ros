# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "A package containing messages used by the RMF traffic management system."
AUTHOR = "Grey <grey@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rmf_ros2"
ROS_BPN = "rmf_traffic_ros2"

ROS_BUILD_DEPENDS = " \
    libeigen \
    nlohmann-json \
    proj \
    rclcpp \
    rmf-building-map-msgs \
    rmf-fleet-msgs \
    rmf-site-map-msgs \
    rmf-traffic \
    rmf-traffic-msgs \
    rmf-utils \
    util-linux \
    yaml-cpp \
    zlib \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    nlohmann-json \
    proj \
    rclcpp \
    rmf-building-map-msgs \
    rmf-fleet-msgs \
    rmf-site-map-msgs \
    rmf-traffic \
    rmf-traffic-msgs \
    rmf-utils \
    yaml-cpp \
    zlib \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    nlohmann-json \
    proj \
    rclcpp \
    rmf-building-map-msgs \
    rmf-fleet-msgs \
    rmf-site-map-msgs \
    rmf-traffic \
    rmf-traffic-msgs \
    rmf-utils \
    util-linux \
    yaml-cpp \
    zlib \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-catch2 \
    ament-cmake-uncrustify \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rmf_ros2-release/archive/release/humble/rmf_traffic_ros2/2.1.2-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/rmf_traffic_ros2"
SRC_URI = "git://github.com/ros2-gbp/rmf_ros2-release;${ROS_BRANCH};protocol=https"
SRCREV = "5496071f1df7bf297b3747093a2c70074fd1e466"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
