LOCAL_PATH:= $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE_TAGS := optional

LOCAL_SRC_FILES := \
    $(call all-java-files-under, java) \
    $(call all-Iaidl-files-under, aidl)

LOCAL_PACKAGE_NAME := LedControlAppService
LOCAL_CERTIFICATE := platform
LOCAL_PRIVATE_PLATFORM_APIS := true
LOCAL_USE_AAPT2 := true
LOCAL_RESOURCE_DIR := $(LOCAL_PATH)/res
LOCAL_STATIC_ANDROID_LIBRARIES := \
    android-support-v7-appcompat

#LOCAL_STATIC_JAVA_LIBRARIES += \
#    vendor.gl.ledcontrol@V1.0-java

include $(BUILD_PACKAGE)