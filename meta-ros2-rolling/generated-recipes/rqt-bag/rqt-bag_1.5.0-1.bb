# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "rqt_bag provides a GUI plugin for displaying and replaying ROS bag files."
AUTHOR = "Michael Jeronimo <michael.jeronimo@openrobotics.org>"
ROS_AUTHOR = "Aaron Blasdel <ablasdel@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/rqt_bag"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rqt_bag"
ROS_BPN = "rqt_bag"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    python-qt-binding \
    rclpy \
    rosbag2-py \
    rqt-gui \
    rqt-gui-py \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rqt_bag-release/archive/release/rolling/rqt_bag/1.5.0-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/rqt_bag"
SRC_URI = "git://github.com/ros2-gbp/rqt_bag-release;${ROS_BRANCH};protocol=https"
SRCREV = "7849e766dacf71a1a5646388a38428e5bb1c457f"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}
