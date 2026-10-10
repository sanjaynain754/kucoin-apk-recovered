package retrofit2;

import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes23.dex */
abstract class ParameterHandler<T> {

    /* JADX INFO: loaded from: classes61.dex */
    public static final class Field<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final String name;
        private final Converter<T, String> valueConverter;

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, T t11) throws IOException {
            String strConvert;
            if (t11 == null || (strConvert = this.valueConverter.convert(t11)) == null) {
                return;
            }
            requestBuilder.addFormField(this.name, strConvert, this.encoded);
        }

        public Field(String str, Converter<T, String> converter, boolean z11) {
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
            this.encoded = z11;
        }
    }

    public static final class FieldMap<T> extends ParameterHandler<Map<String, T>> {
        private final boolean encoded;
        private final Method method;

        /* JADX INFO: renamed from: p */
        private final int f97313p;
        private final Converter<T, String> valueConverter;

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map == null) {
                throw Utils.parameterError(this.method, this.f97313p, "Field map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw Utils.parameterError(this.method, this.f97313p, "Field map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw Utils.parameterError(this.method, this.f97313p, "Field map contained null value for key '" + key + "'.", new Object[0]);
                }
                String strConvert = this.valueConverter.convert(value);
                if (strConvert == null) {
                    throw Utils.parameterError(this.method, this.f97313p, "Field map value '" + value + "' converted to null by " + this.valueConverter.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                requestBuilder.addFormField(key, strConvert, this.encoded);
            }
        }

        public FieldMap(Method method, int i11, Converter<T, String> converter, boolean z11) {
            this.method = method;
            this.f97313p = i11;
            this.valueConverter = converter;
            this.encoded = z11;
        }
    }

    public static final class Header<T> extends ParameterHandler<T> {
        private final String name;
        private final Converter<T, String> valueConverter;

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, T t11) throws IOException {
            String strConvert;
            if (t11 == null || (strConvert = this.valueConverter.convert(t11)) == null) {
                return;
            }
            requestBuilder.addHeader(this.name, strConvert);
        }

        public Header(String str, Converter<T, String> converter) {
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
        }
    }

    public static final class HeaderMap<T> extends ParameterHandler<Map<String, T>> {
        private final Method method;

        /* JADX INFO: renamed from: p */
        private final int f97314p;
        private final Converter<T, String> valueConverter;

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map == null) {
                throw Utils.parameterError(this.method, this.f97314p, "Header map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw Utils.parameterError(this.method, this.f97314p, "Header map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw Utils.parameterError(this.method, this.f97314p, "Header map contained null value for key '" + key + "'.", new Object[0]);
                }
                requestBuilder.addHeader(key, this.valueConverter.convert(value));
            }
        }

        public HeaderMap(Method method, int i11, Converter<T, String> converter) {
            this.method = method;
            this.f97314p = i11;
            this.valueConverter = converter;
        }
    }

    /* JADX INFO: loaded from: classes61.dex */
    public static final class Headers extends ParameterHandler<okhttp3.Headers> {
        private final Method method;

        /* JADX INFO: renamed from: p */
        private final int f97315p;

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, okhttp3.Headers headers) {
            if (headers == null) {
                throw Utils.parameterError(this.method, this.f97315p, "Headers parameter must not be null.", new Object[0]);
            }
            requestBuilder.addHeaders(headers);
        }

        public Headers(Method method, int i11) {
            this.method = method;
            this.f97315p = i11;
        }
    }

    /* JADX INFO: loaded from: classes61.dex */
    public static final class Part<T> extends ParameterHandler<T> {
        private final Converter<T, RequestBody> converter;
        private final okhttp3.Headers headers;
        private final Method method;

        /* JADX INFO: renamed from: p */
        private final int f97316p;

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, T t11) {
            if (t11 == null) {
                return;
            }
            try {
                requestBuilder.addPart(this.headers, this.converter.convert(t11));
            } catch (IOException e11) {
                throw Utils.parameterError(this.method, this.f97316p, "Unable to convert " + t11 + " to RequestBody", e11);
            }
        }

        public Part(Method method, int i11, okhttp3.Headers headers, Converter<T, RequestBody> converter) {
            this.method = method;
            this.f97316p = i11;
            this.headers = headers;
            this.converter = converter;
        }
    }

    /* JADX INFO: loaded from: classes61.dex */
    public static final class PartMap<T> extends ParameterHandler<Map<String, T>> {
        private final Method method;

        /* JADX INFO: renamed from: p */
        private final int f97317p;
        private final String transferEncoding;
        private final Converter<T, RequestBody> valueConverter;

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map == null) {
                throw Utils.parameterError(this.method, this.f97317p, "Part map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw Utils.parameterError(this.method, this.f97317p, "Part map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw Utils.parameterError(this.method, this.f97317p, "Part map contained null value for key '" + key + "'.", new Object[0]);
                }
                requestBuilder.addPart(okhttp3.Headers.m94723of(HttpHeaders.CONTENT_DISPOSITION, "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.transferEncoding), this.valueConverter.convert(value));
            }
        }

        public PartMap(Method method, int i11, Converter<T, RequestBody> converter, String str) {
            this.method = method;
            this.f97317p = i11;
            this.valueConverter = converter;
            this.transferEncoding = str;
        }
    }

    /* JADX INFO: loaded from: classes61.dex */
    public static final class Path<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final Method method;
        private final String name;

        /* JADX INFO: renamed from: p */
        private final int f97318p;
        private final Converter<T, String> valueConverter;

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, T t11) throws IOException {
            if (t11 != null) {
                requestBuilder.addPathParam(this.name, this.valueConverter.convert(t11), this.encoded);
                return;
            }
            throw Utils.parameterError(this.method, this.f97318p, "Path parameter \"" + this.name + "\" value must not be null.", new Object[0]);
        }

        public Path(Method method, int i11, String str, Converter<T, String> converter, boolean z11) {
            this.method = method;
            this.f97318p = i11;
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
            this.encoded = z11;
        }
    }

    public static final class Query<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final String name;
        private final Converter<T, String> valueConverter;

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, T t11) throws IOException {
            String strConvert;
            if (t11 == null || (strConvert = this.valueConverter.convert(t11)) == null) {
                return;
            }
            requestBuilder.addQueryParam(this.name, strConvert, this.encoded);
        }

        public Query(String str, Converter<T, String> converter, boolean z11) {
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
            this.encoded = z11;
        }
    }

    public static final class QueryMap<T> extends ParameterHandler<Map<String, T>> {
        private final boolean encoded;
        private final Method method;

        /* JADX INFO: renamed from: p */
        private final int f97319p;
        private final Converter<T, String> valueConverter;

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map == null) {
                throw Utils.parameterError(this.method, this.f97319p, "Query map was null", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw Utils.parameterError(this.method, this.f97319p, "Query map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw Utils.parameterError(this.method, this.f97319p, "Query map contained null value for key '" + key + "'.", new Object[0]);
                }
                String strConvert = this.valueConverter.convert(value);
                if (strConvert == null) {
                    throw Utils.parameterError(this.method, this.f97319p, "Query map value '" + value + "' converted to null by " + this.valueConverter.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                requestBuilder.addQueryParam(key, strConvert, this.encoded);
            }
        }

        public QueryMap(Method method, int i11, Converter<T, String> converter, boolean z11) {
            this.method = method;
            this.f97319p = i11;
            this.valueConverter = converter;
            this.encoded = z11;
        }
    }

    /* JADX INFO: loaded from: classes61.dex */
    public static final class QueryName<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final Converter<T, String> nameConverter;

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, T t11) throws IOException {
            if (t11 == null) {
                return;
            }
            requestBuilder.addQueryParam(this.nameConverter.convert(t11), null, this.encoded);
        }

        public QueryName(Converter<T, String> converter, boolean z11) {
            this.nameConverter = converter;
            this.encoded = z11;
        }
    }

    /* JADX INFO: loaded from: classes61.dex */
    public static final class RawPart extends ParameterHandler<MultipartBody.Part> {
        static final RawPart INSTANCE = new RawPart();

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, MultipartBody.Part part) {
            if (part != null) {
                requestBuilder.addPart(part);
            }
        }

        private RawPart() {
        }
    }

    public static final class RelativeUrl extends ParameterHandler<Object> {
        private final Method method;

        /* JADX INFO: renamed from: p */
        private final int f97320p;

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, Object obj) {
            if (obj == null) {
                throw Utils.parameterError(this.method, this.f97320p, "@Url parameter is null.", new Object[0]);
            }
            requestBuilder.setRelativeUrl(obj);
        }

        public RelativeUrl(Method method, int i11) {
            this.method = method;
            this.f97320p = i11;
        }
    }

    /* JADX INFO: loaded from: classes61.dex */
    public static final class Tag<T> extends ParameterHandler<T> {
        final Class<T> cls;

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, T t11) {
            requestBuilder.addTag(this.cls, t11);
        }

        public Tag(Class<T> cls) {
            this.cls = cls;
        }
    }

    public abstract void apply(RequestBuilder requestBuilder, T t11) throws IOException;

    public static final class Body<T> extends ParameterHandler<T> {
        private final Converter<T, RequestBody> converter;
        private final Method method;

        /* JADX INFO: renamed from: p */
        private final int f97312p;

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, T t11) {
            if (t11 == null) {
                throw Utils.parameterError(this.method, this.f97312p, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                requestBuilder.setBody(this.converter.convert(t11));
            } catch (IOException e11) {
                throw Utils.parameterError(this.method, e11, this.f97312p, "Unable to convert " + t11 + " to RequestBody", new Object[0]);
            }
        }

        public Body(Method method, int i11, Converter<T, RequestBody> converter) {
            this.method = method;
            this.f97312p = i11;
            this.converter = converter;
        }
    }

    public final ParameterHandler<Object> array() {
        return new ParameterHandler<Object>() { // from class: retrofit2.ParameterHandler.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // retrofit2.ParameterHandler
            public void apply(RequestBuilder requestBuilder, Object obj) throws IOException {
                if (obj == null) {
                    return;
                }
                int length = Array.getLength(obj);
                for (int i11 = 0; i11 < length; i11++) {
                    ParameterHandler.this.apply(requestBuilder, Array.get(obj, i11));
                }
            }
        };
    }

    public final ParameterHandler<Iterable<T>> iterable() {
        return new ParameterHandler<Iterable<T>>() { // from class: retrofit2.ParameterHandler.1
            @Override // retrofit2.ParameterHandler
            public void apply(RequestBuilder requestBuilder, Iterable<T> iterable) throws IOException {
                if (iterable == null) {
                    return;
                }
                Iterator<T> it = iterable.iterator();
                while (it.hasNext()) {
                    ParameterHandler.this.apply(requestBuilder, it.next());
                }
            }
        };
    }
}
