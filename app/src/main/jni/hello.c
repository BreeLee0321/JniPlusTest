#include <jni.h>
#include <stdio.h>

 jint  Java_bree_com_jniplustest_MainActivity_plus
  (JNIEnv *env, jobject obj, jint x, jint y){
  return x+y;
  }