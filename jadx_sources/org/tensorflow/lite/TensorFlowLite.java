package org.tensorflow.lite;

import androidx.media3.common.MimeTypes;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes61.dex */
public final class TensorFlowLite {
    private static final Throwable LOAD_LIBRARY_EXCEPTION;
    private static final String[][] TFLITE_RUNTIME_LIBNAMES;
    private static final AtomicBoolean[] haveLogged;
    private static final Logger logger = Logger.getLogger(TensorFlowLite.class.getName());
    private static volatile boolean isInit = false;

    public static class PossiblyAvailableRuntime {
        private final Exception exception;
        private final InterpreterFactoryApi factory;

        public Exception getException() {
            return this.exception;
        }

        public InterpreterFactoryApi getFactory() {
            return this.factory;
        }

        public PossiblyAvailableRuntime(String str, String str2) {
            InterpreterFactoryApi interpreterFactoryApi;
            Exception e11 = null;
            try {
                Constructor<?> declaredConstructor = Class.forName(str + ".InterpreterFactoryImpl").getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                interpreterFactoryApi = (InterpreterFactoryApi) declaredConstructor.newInstance(new Object[0]);
                try {
                    if (interpreterFactoryApi != null) {
                        TensorFlowLite.logger.info(String.format("Found %s TF Lite runtime client in %s", str2, str));
                    } else {
                        TensorFlowLite.logger.warning(String.format("Failed to construct TF Lite runtime client from %s", str));
                    }
                } catch (ClassNotFoundException e12) {
                    e11 = e12;
                    TensorFlowLite.logger.info(String.format("Didn't find %s TF Lite runtime client in %s", str2, str));
                } catch (IllegalAccessException e13) {
                    e11 = e13;
                    TensorFlowLite.logger.info(String.format("Didn't find %s TF Lite runtime client in %s", str2, str));
                } catch (IllegalArgumentException e14) {
                    e11 = e14;
                    TensorFlowLite.logger.info(String.format("Didn't find %s TF Lite runtime client in %s", str2, str));
                } catch (InstantiationException e15) {
                    e11 = e15;
                    TensorFlowLite.logger.info(String.format("Didn't find %s TF Lite runtime client in %s", str2, str));
                } catch (NoSuchMethodException e16) {
                    e11 = e16;
                    TensorFlowLite.logger.info(String.format("Didn't find %s TF Lite runtime client in %s", str2, str));
                } catch (SecurityException e17) {
                    e11 = e17;
                    TensorFlowLite.logger.info(String.format("Didn't find %s TF Lite runtime client in %s", str2, str));
                } catch (InvocationTargetException e18) {
                    e11 = e18;
                    TensorFlowLite.logger.info(String.format("Didn't find %s TF Lite runtime client in %s", str2, str));
                }
            } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e19) {
                interpreterFactoryApi = null;
                e11 = e19;
            }
            this.exception = e11;
            this.factory = interpreterFactoryApi;
        }
    }

    public static InterpreterFactoryApi getFactory(InterpreterApi.Options.TfLiteRuntime tfLiteRuntime) {
        return getFactory(tfLiteRuntime, "org.tensorflow.lite.InterpreterApi.Options", "setRuntime");
    }

    private static native void nativeDoNothing();

    public static String runtimeVersion(InterpreterApi.Options.TfLiteRuntime tfLiteRuntime) {
        return getFactory(tfLiteRuntime, "org.tensorflow.lite.TensorFlowLite", "runtimeVersion").runtimeVersion();
    }

    public static String schemaVersion(InterpreterApi.Options.TfLiteRuntime tfLiteRuntime) {
        return getFactory(tfLiteRuntime, "org.tensorflow.lite.TensorFlowLite", "schemaVersion").schemaVersion();
    }

    /* JADX INFO: renamed from: org.tensorflow.lite.TensorFlowLite$1 */
    public static /* synthetic */ class C433241 {

        /* JADX INFO: renamed from: $SwitchMap$org$tensorflow$lite$InterpreterApi$Options$TfLiteRuntime */
        static final /* synthetic */ int[] f95641x9de0ace7;

        static {
            int[] iArr = new int[InterpreterApi.Options.TfLiteRuntime.values().length];
            f95641x9de0ace7 = iArr;
            try {
                iArr[InterpreterApi.Options.TfLiteRuntime.FROM_APPLICATION_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f95641x9de0ace7[InterpreterApi.Options.TfLiteRuntime.FROM_SYSTEM_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class RuntimeFromApplication {
        static final PossiblyAvailableRuntime TFLITE = new PossiblyAvailableRuntime("org.tensorflow.lite", MimeTypes.BASE_TYPE_APPLICATION);

        private RuntimeFromApplication() {
        }
    }

    public static class RuntimeFromSystem {
        static final PossiblyAvailableRuntime TFLITE = new PossiblyAvailableRuntime("com.google.android.gms.tflite", "system");

        private RuntimeFromSystem() {
        }
    }

    static {
        String[][] strArr = {new String[]{"tensorflowlite_jni", "tensorflowlite_jni_stable"}, new String[]{"tensorflowlite_jni_gms_client"}};
        TFLITE_RUNTIME_LIBNAMES = strArr;
        UnsatisfiedLinkError unsatisfiedLinkError = null;
        for (String[] strArr2 : strArr) {
            for (String str : strArr2) {
                try {
                    System.loadLibrary(str);
                    logger.info("Loaded native library: " + str);
                    break;
                } catch (UnsatisfiedLinkError e11) {
                    logger.info("Didn't load native library: " + str);
                    if (unsatisfiedLinkError == null) {
                        unsatisfiedLinkError = e11;
                    } else {
                        unsatisfiedLinkError.addSuppressed(e11);
                    }
                }
            }
        }
        LOAD_LIBRARY_EXCEPTION = unsatisfiedLinkError;
        haveLogged = new AtomicBoolean[InterpreterApi.Options.TfLiteRuntime.values().length];
        for (int i11 = 0; i11 < InterpreterApi.Options.TfLiteRuntime.values().length; i11++) {
            haveLogged[i11] = new AtomicBoolean();
        }
    }

    private static InterpreterFactoryApi getFactory(InterpreterApi.Options.TfLiteRuntime tfLiteRuntime, String str, String str2) {
        Exception exception;
        String str3;
        if (tfLiteRuntime == null) {
            tfLiteRuntime = InterpreterApi.Options.TfLiteRuntime.FROM_APPLICATION_ONLY;
        }
        InterpreterApi.Options.TfLiteRuntime tfLiteRuntime2 = InterpreterApi.Options.TfLiteRuntime.PREFER_SYSTEM_OVER_APPLICATION;
        if (tfLiteRuntime == tfLiteRuntime2 || tfLiteRuntime == InterpreterApi.Options.TfLiteRuntime.FROM_SYSTEM_ONLY) {
            PossiblyAvailableRuntime possiblyAvailableRuntime = RuntimeFromSystem.TFLITE;
            if (possiblyAvailableRuntime.getFactory() != null) {
                if (!haveLogged[tfLiteRuntime.ordinal()].getAndSet(true)) {
                    logger.info(String.format("TfLiteRuntime.%s: Using system TF Lite runtime client from com.google.android.gms", tfLiteRuntime.name()));
                }
                return possiblyAvailableRuntime.getFactory();
            }
            exception = possiblyAvailableRuntime.getException();
        } else {
            exception = null;
        }
        if (tfLiteRuntime == tfLiteRuntime2 || tfLiteRuntime == InterpreterApi.Options.TfLiteRuntime.FROM_APPLICATION_ONLY) {
            PossiblyAvailableRuntime possiblyAvailableRuntime2 = RuntimeFromApplication.TFLITE;
            if (possiblyAvailableRuntime2.getFactory() != null) {
                if (!haveLogged[tfLiteRuntime.ordinal()].getAndSet(true)) {
                    logger.info(String.format("TfLiteRuntime.%s: Using application TF Lite runtime client from org.tensorflow.lite", tfLiteRuntime.name()));
                }
                return possiblyAvailableRuntime2.getFactory();
            }
            if (exception == null) {
                exception = possiblyAvailableRuntime2.getException();
            } else if (exception.getSuppressed().length == 0) {
                exception.addSuppressed(possiblyAvailableRuntime2.getException());
            }
        }
        int i11 = C433241.f95641x9de0ace7[tfLiteRuntime.ordinal()];
        if (i11 != 1) {
            str3 = i11 != 2 ? "You should declare a build dependency on org.tensorflow.lite:tensorflow-lite or com.google.android.gms:play-services-tflite-java" : String.format("You should declare a build dependency on com.google.android.gms:play-services-tflite-java, or call .%s with a value other than TfLiteRuntime.FROM_SYSTEM_ONLY  (see docs for %s#%s).", str2, str, str2);
        } else {
            str3 = String.format("You should declare a build dependency on org.tensorflow.lite:tensorflow-lite, or call .%s with a value other than TfLiteRuntime.FROM_APPLICATION_ONLY (see docs for %s#%s(TfLiteRuntime)).", str2, str, str2);
        }
        throw new IllegalStateException("Couldn't find TensorFlow Lite runtime's InterpreterFactoryImpl class -- make sure your app links in the right TensorFlow Lite runtime. " + str3, exception);
    }

    public static void init() {
        if (isInit) {
            return;
        }
        try {
            nativeDoNothing();
            isInit = true;
        } catch (UnsatisfiedLinkError e11) {
            Throwable th2 = LOAD_LIBRARY_EXCEPTION;
            if (th2 == null) {
                th2 = e11;
            }
            UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError("Failed to load native TensorFlow Lite methods. Check that the correct native libraries are present, and, if using a custom native library, have been properly loaded via System.loadLibrary():\n  " + th2);
            unsatisfiedLinkError.initCause(e11);
            throw unsatisfiedLinkError;
        }
    }

    private TensorFlowLite() {
    }

    public static String runtimeVersion() {
        return runtimeVersion(null);
    }

    public static String schemaVersion() {
        return schemaVersion(null);
    }

    @Deprecated
    public static String version() {
        return schemaVersion();
    }
}
