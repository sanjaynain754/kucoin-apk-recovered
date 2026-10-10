package com.facebook.react.bridge;

import java.lang.reflect.Method;
import p633t6.InterfaceC44695a;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC44695a
public class ReactCxxErrorHandler {
    private static Method mHandleErrorFunc;
    private static Object mObject;

    @InterfaceC44695a
    private static void handleError(String str) {
        if (mHandleErrorFunc != null) {
            try {
                mHandleErrorFunc.invoke(mObject, new Exception(str));
            } catch (Exception e11) {
                C45999a.m101508n("ReactCxxErrorHandler", "Failed to invoke error handler function", e11);
            }
        }
    }

    @InterfaceC44695a
    public static void setHandleErrorFunc(Object obj, Method method) {
        mObject = obj;
        mHandleErrorFunc = method;
    }
}
