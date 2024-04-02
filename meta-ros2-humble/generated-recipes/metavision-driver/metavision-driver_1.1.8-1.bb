# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "ROS1 and ROS2 drivers for metavision based event cameras"
AUTHOR = "Bernd Pfrommer <bernd.pfrommer@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=4083d50af96f9bddbe68e0de85b0a7db"

ROS_CN = "metavision_driver"
ROS_BPN = "metavision_driver"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libopenscenegraph} \
    boost \
    event-camera-msgs \
    ffmpeg \
    glew \
    glfw \
    hdf5 \
    libusb1 \
    opencv \
    rclcpp \
    rclcpp-components \
    std-srvs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-auto-native \
    ament-cmake-native \
    ament-cmake-ros-native \
    cmake-native \
    curl-native \
    git-native \
    hdf5-native \
    ros-environment-native \
    unzip-native \
    wget-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libopenscenegraph} \
    boost \
    event-camera-msgs \
    ffmpeg \
    glew \
    glfw \
    hdf5 \
    libusb1 \
    opencv \
    rclcpp \
    rclcpp-components \
    std-srvs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libopenscenegraph} \
    boost \
    event-camera-msgs \
    ffmpeg \
    glew \
    glfw \
    hdf5 \
    libusb1 \
    opencv \
    rclcpp \
    rclcpp-components \
    std-srvs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-clang-format \
    ament-cmake-copyright \
    ament-cmake-cppcheck \
    ament-cmake-cpplint \
    ament-cmake-flake8 \
    ament-cmake-lint-cmake \
    ament-cmake-pep257 \
    ament-cmake-xmllint \
    gtest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/metavision_driver-release/archive/release/humble/metavision_driver/1.1.8-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/metavision_driver"
SRC_URI = "git://github.com/ros2-gbp/metavision_driver-release;${ROS_BRANCH};protocol=https"
SRCREV = "bc74357f4366857e17faaae4ec7b8e4ce6729c2d"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
