package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import okhttp3.ResponseBody;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes23.dex */
abstract class HttpServiceMethod<ResponseT, ReturnT> extends ServiceMethod<ReturnT> {
    private final okhttp3.Call.Factory callFactory;
    private final RequestFactory requestFactory;
    private final Converter<ResponseBody, ResponseT> responseConverter;

    public static final class CallAdapted<ResponseT, ReturnT> extends HttpServiceMethod<ResponseT, ReturnT> {
        private final CallAdapter<ResponseT, ReturnT> callAdapter;

        @Override // retrofit2.HttpServiceMethod
        public ReturnT adapt(Call<ResponseT> call, Object[] objArr) {
            return this.callAdapter.adapt(call);
        }

        public CallAdapted(RequestFactory requestFactory, okhttp3.Call.Factory factory, Converter<ResponseBody, ResponseT> converter, CallAdapter<ResponseT, ReturnT> callAdapter) {
            super(requestFactory, factory, converter);
            this.callAdapter = callAdapter;
        }
    }

    public static final class SuspendForBody<ResponseT> extends HttpServiceMethod<ResponseT, Object> {
        private final CallAdapter<ResponseT, Call<ResponseT>> callAdapter;
        private final boolean isNullable;

        @Override // retrofit2.HttpServiceMethod
        public Object adapt(Call<ResponseT> call, Object[] objArr) {
            Call<ResponseT> callAdapt = this.callAdapter.adapt(call);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                return this.isNullable ? KotlinExtensions.awaitNullable(callAdapt, continuation) : KotlinExtensions.await(callAdapt, continuation);
            } catch (Exception e11) {
                return KotlinExtensions.suspendAndThrow(e11, continuation);
            }
        }

        public SuspendForBody(RequestFactory requestFactory, okhttp3.Call.Factory factory, Converter<ResponseBody, ResponseT> converter, CallAdapter<ResponseT, Call<ResponseT>> callAdapter, boolean z11) {
            super(requestFactory, factory, converter);
            this.callAdapter = callAdapter;
            this.isNullable = z11;
        }
    }

    /* JADX INFO: loaded from: classes61.dex */
    public static final class SuspendForResponse<ResponseT> extends HttpServiceMethod<ResponseT, Object> {
        private final CallAdapter<ResponseT, Call<ResponseT>> callAdapter;

        @Override // retrofit2.HttpServiceMethod
        public Object adapt(Call<ResponseT> call, Object[] objArr) {
            Call<ResponseT> callAdapt = this.callAdapter.adapt(call);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                return KotlinExtensions.awaitResponse(callAdapt, continuation);
            } catch (Exception e11) {
                return KotlinExtensions.suspendAndThrow(e11, continuation);
            }
        }

        public SuspendForResponse(RequestFactory requestFactory, okhttp3.Call.Factory factory, Converter<ResponseBody, ResponseT> converter, CallAdapter<ResponseT, Call<ResponseT>> callAdapter) {
            super(requestFactory, factory, converter);
            this.callAdapter = callAdapter;
        }
    }

    public static <ResponseT, ReturnT> HttpServiceMethod<ResponseT, ReturnT> parseAnnotations(Retrofit retrofit, Method method, RequestFactory requestFactory) {
        Type genericReturnType;
        boolean z11;
        boolean z12 = requestFactory.isKotlinSuspendFunction;
        Annotation[] annotations = method.getAnnotations();
        if (z12) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type parameterLowerBound = Utils.getParameterLowerBound(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (Utils.getRawType(parameterLowerBound) == Response.class && (parameterLowerBound instanceof ParameterizedType)) {
                parameterLowerBound = Utils.getParameterUpperBound(0, (ParameterizedType) parameterLowerBound);
                z11 = true;
            } else {
                z11 = false;
            }
            genericReturnType = new Utils.ParameterizedTypeImpl(null, Call.class, parameterLowerBound);
            annotations = SkipCallbackExecutorImpl.ensurePresent(annotations);
        } else {
            genericReturnType = method.getGenericReturnType();
            z11 = false;
        }
        CallAdapter callAdapterCreateCallAdapter = createCallAdapter(retrofit, method, genericReturnType, annotations);
        Type type = callAdapterCreateCallAdapter.getType();
        if (type == okhttp3.Response.class) {
            throw Utils.methodError(method, "'" + Utils.getRawType(type).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (type == Response.class) {
            throw Utils.methodError(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (requestFactory.httpMethod.equals("HEAD") && !Void.class.equals(type)) {
            throw Utils.methodError(method, "HEAD method must use Void as response type.", new Object[0]);
        }
        Converter converterCreateResponseConverter = createResponseConverter(retrofit, method, type);
        okhttp3.Call.Factory factory = retrofit.callFactory;
        if (z12) {
            return z11 ? new SuspendForResponse(requestFactory, factory, converterCreateResponseConverter, callAdapterCreateCallAdapter) : new SuspendForBody(requestFactory, factory, converterCreateResponseConverter, callAdapterCreateCallAdapter, false);
        }
        return new CallAdapted(requestFactory, factory, converterCreateResponseConverter, callAdapterCreateCallAdapter);
    }

    public abstract ReturnT adapt(Call<ResponseT> call, Object[] objArr);

    @Override // retrofit2.ServiceMethod
    public final ReturnT invoke(Object[] objArr) {
        return adapt(new OkHttpCall(this.requestFactory, objArr, this.callFactory, this.responseConverter), objArr);
    }

    public HttpServiceMethod(RequestFactory requestFactory, okhttp3.Call.Factory factory, Converter<ResponseBody, ResponseT> converter) {
        this.requestFactory = requestFactory;
        this.callFactory = factory;
        this.responseConverter = converter;
    }

    private static <ResponseT, ReturnT> CallAdapter<ResponseT, ReturnT> createCallAdapter(Retrofit retrofit, Method method, Type type, Annotation[] annotationArr) {
        try {
            return (CallAdapter<ResponseT, ReturnT>) retrofit.callAdapter(type, annotationArr);
        } catch (RuntimeException e11) {
            throw Utils.methodError(method, e11, "Unable to create call adapter for %s", type);
        }
    }

    private static <ResponseT> Converter<ResponseBody, ResponseT> createResponseConverter(Retrofit retrofit, Method method, Type type) {
        try {
            return retrofit.responseBodyConverter(type, method.getAnnotations());
        } catch (RuntimeException e11) {
            throw Utils.methodError(method, e11, "Unable to create converter for %s", type);
        }
    }
}
