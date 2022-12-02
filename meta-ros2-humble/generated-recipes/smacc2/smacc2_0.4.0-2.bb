# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "An Event-Driven, Asynchronous, Behavioral State Machine Library for ROS2 (Robotic Operating System) applications written in C++."
AUTHOR = "Pablo Inigo Blasco <pablo@robosoft.ai>"
ROS_AUTHOR = "Pablo Inigo Blasco <pablo@robosoft.ai>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_CN = "SMACC2"
ROS_BPN = "smacc2"

ROS_BUILD_DEPENDS = " \
    boost \
    lttng-ust \
    rcl \
    rclcpp \
    rclcpp-action \
    smacc2-msgs \
    tracetools \
    tracetools-launch \
    tracetools-trace \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    lttng-ust \
    rcl \
    rclcpp \
    rclcpp-action \
    smacc2-msgs \
    tracetools \
    tracetools-launch \
    tracetools-trace \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    lttng-ust \
    rcl \
    rclcpp \
    rclcpp-action \
    smacc2-msgs \
    tracetools \
    tracetools-launch \
    tracetools-trace \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/SMACC2-release/archive/release/humble/smacc2/0.4.0-2.tar.gz
ROS_BRANCH ?= "branch=release/humble/smacc2"
SRC_URI = "git://github.com/ros2-gbp/SMACC2-release;${ROS_BRANCH};protocol=https"
SRCREV = "8baa5b75d373e62fec952fb518d2b07d0fde00a5"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
