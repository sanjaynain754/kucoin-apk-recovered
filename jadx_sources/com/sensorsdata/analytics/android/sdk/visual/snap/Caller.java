package com.sensorsdata.analytics.android.sdk.visual.snap;

import android.view.View;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.tencent.bugly.proguard.C33978va;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes59.dex */
public class Caller {
    private static final String TAG = "SA.Caller";
    private final Object[] mMethodArgs;
    private final String mMethodName;
    private final Class<?> mMethodResultType;
    private final Class<?> mTargetClass;
    private final Method mTargetMethod;

    private static Class<?> assignableArgType(Class<?> cls) {
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        return cls == Character.class ? Character.TYPE : cls;
    }

    private Method pickMethod(Class<?> cls) {
        Class[] clsArr = new Class[this.mMethodArgs.length];
        int i11 = 0;
        while (true) {
            Object[] objArr = this.mMethodArgs;
            if (i11 >= objArr.length) {
                break;
            }
            clsArr[i11] = objArr[i11].getClass();
            i11++;
        }
        for (Method method : cls.getMethods()) {
            String name = method.getName();
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (name.equals(this.mMethodName) && parameterTypes.length == this.mMethodArgs.length && assignableArgType(this.mMethodResultType).isAssignableFrom(assignableArgType(method.getReturnType()))) {
                boolean zIsAssignableFrom = true;
                for (int i12 = 0; i12 < parameterTypes.length && zIsAssignableFrom; i12++) {
                    zIsAssignableFrom = assignableArgType(parameterTypes[i12]).isAssignableFrom(assignableArgType(clsArr[i12]));
                }
                if (zIsAssignableFrom) {
                    return method;
                }
            }
        }
        return null;
    }

    public Object applyMethod(View view) {
        return applyMethodWithArguments(view, this.mMethodArgs);
    }

    public Object applyMethodWithArguments(View view, Object[] objArr) {
        if (!this.mTargetClass.isAssignableFrom(view.getClass())) {
            return null;
        }
        try {
            return this.mTargetMethod.invoke(view, objArr);
        } catch (IllegalAccessException e11) {
            SALog.m68590i(TAG, "Method " + this.mTargetMethod.getName() + " appears not to be public", e11);
            return null;
        } catch (IllegalArgumentException e12) {
            SALog.m68590i(TAG, "Method " + this.mTargetMethod.getName() + " called with arguments of the wrong type", e12);
            return null;
        } catch (InvocationTargetException e13) {
            SALog.m68590i(TAG, "Method " + this.mTargetMethod.getName() + " threw an exception", e13);
            return null;
        }
    }

    public boolean argsAreApplicable(Object[] objArr) {
        Class<?>[] parameterTypes = this.mTargetMethod.getParameterTypes();
        if (objArr.length != parameterTypes.length) {
            return false;
        }
        for (int i11 = 0; i11 < objArr.length; i11++) {
            Class<?> clsAssignableArgType = assignableArgType(parameterTypes[i11]);
            Object obj = objArr[i11];
            if (obj == null) {
                if (clsAssignableArgType == Byte.TYPE || clsAssignableArgType == Short.TYPE || clsAssignableArgType == Integer.TYPE || clsAssignableArgType == Long.TYPE || clsAssignableArgType == Float.TYPE || clsAssignableArgType == Double.TYPE || clsAssignableArgType == Boolean.TYPE || clsAssignableArgType == Character.TYPE) {
                    return false;
                }
            } else if (!clsAssignableArgType.isAssignableFrom(assignableArgType(obj.getClass()))) {
                return false;
            }
        }
        return true;
    }

    public Object[] getArgs() {
        return this.mMethodArgs;
    }

    public String toString() {
        return "[Caller " + this.mMethodName + "(" + this.mMethodArgs + ")]";
    }

    public Caller(Class<?> cls, String str, Object[] objArr, Class<?> cls2) throws NoSuchMethodException {
        this.mMethodName = str;
        this.mMethodArgs = objArr;
        this.mMethodResultType = cls2;
        Method methodPickMethod = pickMethod(cls);
        this.mTargetMethod = methodPickMethod;
        if (methodPickMethod != null) {
            this.mTargetClass = methodPickMethod.getDeclaringClass();
            return;
        }
        throw new NoSuchMethodException("Method " + cls.getName() + C33978va.f72339h + str + " doesn't exit");
    }
}
