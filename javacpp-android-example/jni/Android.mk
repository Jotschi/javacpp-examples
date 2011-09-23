LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE := jniOpenGLNative

LOCAL_CFLAGS := -DANDROID_NDK
LOCAL_CPPFLAGS += -fexceptions

LOCAL_SRC_FILES := opengltest.c ../target/jniOpenGLNative.cpp

LOCAL_LDLIBS := -lGLESv2 -llog

include $(BUILD_SHARED_LIBRARY)

