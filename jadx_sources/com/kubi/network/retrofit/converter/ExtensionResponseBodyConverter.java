package com.kubi.network.retrofit.converter;

import androidx.annotation.Keep;
import androidx.exifinterface.media.ExifInterface;
import com.kubi.network.retrofit.utils.C19333e;
import com.kubi.utils.C27099x;
import java.io.IOException;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p511or.C43174a;
import p569qq.C43840a;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;
import pr.C43529b;
import retrofit2.Converter;
import ro.C44128b;

/* JADX INFO: compiled from: ExtensionResponseBodyConverter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u0000 \u0014*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0014B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\u0004\u0018\u00018\u00002\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J!\u0010\f\u001a\u0004\u0018\u00018\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/network/retrofit/converter/ExtensionResponseBodyConverter;", ExifInterface.GPS_DIRECTION_TRUE, "Lretrofit2/Converter;", "Lokhttp3/ResponseBody;", "type", "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Type;)V", "convert", "value", "(Lokhttp3/ResponseBody;)Ljava/lang/Object;", "getEmptyJsonByType", "", "parseData", "data", "", "ignore", "", "(Ljava/lang/Object;Z)Ljava/lang/Object;", "toString", "obj", "Companion", "network-core-retrofit_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class ExtensionResponseBodyConverter<T> implements Converter<ResponseBody, T> {

    @NotNull
    private static final String TAG = "ExtensionResponseBodyConverter";

    @NotNull
    private final Type type;

    /* JADX INFO: renamed from: com.kubi.network.retrofit.converter.ExtensionResponseBodyConverter$convert$1 */
    /* JADX INFO: compiled from: ExtensionResponseBodyConverter.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public /* synthetic */ class C193271 extends FunctionReferenceImpl implements Function2<Object, Boolean, T> {
        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Boolean bool) {
            return invoke(obj, bool.booleanValue());
        }

        public C193271(Object obj) {
            super(2, obj, ExtensionResponseBodyConverter.class, "parseData", "parseData(Ljava/lang/Object;Z)Ljava/lang/Object;", 0);
        }

        @Nullable
        public final T invoke(@Nullable Object obj, boolean z11) {
            return (T) ((ExtensionResponseBodyConverter) this.receiver).parseData(obj, z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T parseData(Object data, boolean ignore) {
        String string;
        if (data == null) {
            return null;
        }
        try {
            string = toString(data);
            try {
                return (T) C27099x.m66914d(string, this.type);
            } catch (Throwable th2) {
                th = th2;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("url:");
                C43529b c43529b = C43529b.f96063a;
                Request request = c43529b.m95792a().get();
                sb2.append(request != null ? request.url() : null);
                C44128b.m97262f(TAG, sb2.toString(), th);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("url:");
                Request request2 = c43529b.m95792a().get();
                sb3.append(request2 != null ? request2.url() : null);
                sb3.append(", data=");
                sb3.append(string);
                C43840a.m96550d(sb3.toString(), TAG);
                C43174a.m94786b(th, 0, ignore);
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            string = null;
        }
    }

    public ExtensionResponseBodyConverter(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
    }

    private final String getEmptyJsonByType(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return (cls.isArray() || List.class.isAssignableFrom(cls)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            return ((rawType instanceof Class) && List.class.isAssignableFrom((Class) rawType)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
        }
        if (type instanceof GenericArrayType) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        return type instanceof WildcardType ? getEmptyJsonByType(((WildcardType) type).getUpperBounds()[0]) : "{}";
    }

    @Override // retrofit2.Converter
    @Nullable
    public T convert(@NotNull ResponseBody value) throws IOException {
        Intrinsics.checkNotNullParameter(value, "value");
        return (T) C19333e.f35973a.m42845b(value, new C193271(this));
    }

    private final String toString(Object obj) {
        if (Intrinsics.areEqual("null", obj.toString())) {
            return getEmptyJsonByType(this.type);
        }
        if (obj instanceof String) {
            return C27099x.m66919i(obj, false, 2, null);
        }
        return obj.toString();
    }
}
