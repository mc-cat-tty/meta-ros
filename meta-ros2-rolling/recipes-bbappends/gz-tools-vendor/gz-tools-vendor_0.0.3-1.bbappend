# Copyright (c) 2024 Wind River Systems, Inc.

DEPENDS += " gz-tools2 gz-tools2-native"

# See CMakeLists.txt for details on why /usr/opt/gz_tools_vendor/ is used
FILES:${PN} += " \
  ${prefix}/opt/gz_tools_vendor/extra_cmake/lib/cmake/gz-tools/gz-tools-config-version.cmake \
  ${prefix}/opt/gz_tools_vendor/extra_cmake/lib/cmake/gz-tools/gz-tools-config.cmake \
"
