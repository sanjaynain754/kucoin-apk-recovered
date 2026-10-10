package jumio.core;

import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pair;
import com.jumio.commons.log.Log;
import com.jumio.commons.log.LogLevel;
import com.jumio.commons.log.LogUtils;
import com.jumio.core.models.ApiCallDataModel;
import com.jumio.core.network.ApiCall;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.ArrayIteratorKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.p407io.ByteStreamsKt;
import p852kotlin.p407io.CloseableKt;

/* JADX INFO: renamed from: jumio.core.z2 */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC40760z2 extends ApiCall {

    /* JADX INFO: renamed from: h */
    public final ArrayList f90508h;

    /* JADX INFO: renamed from: i */
    public final C40692m f90509i;

    /* JADX INFO: renamed from: j */
    public final C40692m f90510j;

    /* JADX INFO: renamed from: k */
    public final C40692m f90511k;

    /* JADX INFO: renamed from: l */
    public final Map f90512l;

    public abstract void prepareData();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC40760z2(@NotNull InterfaceC40657f apiCallSettings, @NotNull ApiCallDataModel<?> apiCallDataModel) {
        super(apiCallSettings, apiCallDataModel);
        Intrinsics.checkNotNullParameter(apiCallSettings, "apiCallSettings");
        Intrinsics.checkNotNullParameter(apiCallDataModel, "apiCallDataModel");
        this.f90508h = new ArrayList();
        Charset charsetForName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
        String str = "+++Android_JMSDK_mobile_" + UUID.randomUUID() + "+++";
        C40692m c40692m = new C40692m(str, charsetForName);
        C40692m c40692m2 = new C40692m("--", charsetForName);
        C40692m c40692m3 = new C40692m(LogUtils.NEW_LINE, charsetForName);
        this.f90509i = c40692m3;
        this.f90510j = c40692m2.m89260a(c40692m).m89260a(c40692m3);
        this.f90511k = c40692m2.m89260a(c40692m).m89260a(c40692m2).m89260a(c40692m3);
        Map mutableMap = MapsKt.toMutableMap(super.getHeaders());
        mutableMap.put("Content-Type", "multipart/form-data; boundary=".concat(str));
        this.f90512l = mutableMap;
    }

    public static /* synthetic */ void addPart$default(AbstractC40760z2 abstractC40760z2, String[] strArr, Object obj, int i11, int i12, Object obj2) throws Exception {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPart");
        }
        if ((i12 & 4) != 0) {
            i11 = -1;
        }
        abstractC40760z2.addPart(strArr, obj, i11);
    }

    public final void addPart(@NotNull String[] headers, @NotNull Object data, int i11) throws Exception {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(data, "data");
        if (!(data instanceof InputStream) && !(data instanceof File) && !(data instanceof String) && !(data instanceof byte[])) {
            throw new Exception(data.getClass().getSimpleName().concat(" is not supported"));
        }
        if (i11 == -1) {
            this.f90508h.add(new Pair(headers, data));
        } else {
            this.f90508h.add(i11, new Pair(headers, data));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.jumio.core.network.ApiCall
    public void fillRequest(@NotNull OutputStream outputStream) throws IOException {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        for (Pair pair : this.f90508h) {
            outputStream.write(this.f90510j.f90324c);
            Iterator it = ArrayIteratorKt.iterator((Object[]) pair.first);
            while (it.hasNext()) {
                String str = (String) it.next();
                Charset charsetForName = Charset.forName("UTF-8");
                Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
                byte[] bytes = str.getBytes(charsetForName);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                outputStream.write(bytes);
                outputStream.write(this.f90509i.f90324c);
            }
            outputStream.write(this.f90509i.f90324c);
            S s11 = pair.second;
            if (s11 instanceof InputStream) {
                Intrinsics.checkNotNull(s11, "null cannot be cast to non-null type java.io.InputStream");
                InputStream inputStream = (InputStream) s11;
                try {
                    ByteStreamsKt.copyTo$default(inputStream, outputStream, 0, 2, null);
                    CloseableKt.closeFinally(inputStream, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(inputStream, th2);
                        throw th3;
                    }
                }
            } else if (s11 instanceof File) {
                S s12 = pair.second;
                Intrinsics.checkNotNull(s12, "null cannot be cast to non-null type java.io.File");
                FileInputStream fileInputStream = new FileInputStream((File) s12);
                try {
                    ByteStreamsKt.copyTo$default(fileInputStream, outputStream, 0, 2, null);
                    CloseableKt.closeFinally(fileInputStream, null);
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        CloseableKt.closeFinally(fileInputStream, th4);
                        throw th5;
                    }
                }
            } else if (s11 instanceof String) {
                Intrinsics.checkNotNull(s11, "null cannot be cast to non-null type kotlin.String");
                Charset charsetForName2 = Charset.forName("UTF-8");
                Intrinsics.checkNotNullExpressionValue(charsetForName2, "forName(...)");
                byte[] bytes2 = ((String) s11).getBytes(charsetForName2);
                Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
                outputStream.write(bytes2);
            } else if (s11 instanceof byte[]) {
                Intrinsics.checkNotNull(s11, "null cannot be cast to non-null type kotlin.ByteArray");
                outputStream.write((byte[]) s11);
            }
            outputStream.write(this.f90509i.f90324c);
        }
        outputStream.write(this.f90511k.f90324c);
    }

    @Override // com.jumio.core.network.ApiCall
    @NotNull
    public Map<String, String> getHeaders() {
        return this.f90512l;
    }

    @NotNull
    public final List<Pair<String[], Object>> getParts$jumio_core_release() {
        return this.f90508h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.jumio.core.network.ApiCall
    public int prepareRequest() throws Exception {
        int iAvailable;
        this.f90508h.clear();
        prepareData();
        if (this.f90508h.size() == 0) {
            throw new Exception("Nothing to upload");
        }
        StringBuilder sb2 = new StringBuilder();
        int length = 0;
        for (Pair pair : this.f90508h) {
            int length2 = length + this.f90510j.f90324c.length;
            Log log = Log.INSTANCE;
            LogLevel logLevel = LogLevel.OFF;
            Iterator it = ArrayIteratorKt.iterator((Object[]) pair.first);
            while (it.hasNext()) {
                String str = (String) it.next();
                Charset charsetForName = Charset.forName("UTF-8");
                Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
                byte[] bytes = str.getBytes(charsetForName);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                length2 = length2 + bytes.length + this.f90509i.f90324c.length;
                Log log2 = Log.INSTANCE;
                LogLevel logLevel2 = LogLevel.OFF;
            }
            int length3 = length2 + this.f90509i.f90324c.length;
            Log log3 = Log.INSTANCE;
            LogLevel logLevel3 = LogLevel.OFF;
            S s11 = pair.second;
            if (s11 instanceof InputStream) {
                try {
                    Intrinsics.checkNotNull(s11, "null cannot be cast to non-null type java.io.InputStream");
                    iAvailable = ((InputStream) s11).available();
                    length3 += iAvailable;
                } catch (IOException e11) {
                    Log.m14471e(getF14409e(), e11);
                }
            } else {
                if (s11 instanceof File) {
                    Intrinsics.checkNotNull(s11, "null cannot be cast to non-null type java.io.File");
                    iAvailable = (int) ((File) s11).length();
                } else if (s11 instanceof String) {
                    Intrinsics.checkNotNull(s11, "null cannot be cast to non-null type kotlin.String");
                    Charset charsetForName2 = Charset.forName("UTF-8");
                    Intrinsics.checkNotNullExpressionValue(charsetForName2, "forName(...)");
                    byte[] bytes2 = ((String) s11).getBytes(charsetForName2);
                    Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
                    length3 += bytes2.length;
                    S s12 = pair.second;
                    Intrinsics.checkNotNull(s12, "null cannot be cast to non-null type kotlin.String");
                } else if (s11 instanceof byte[]) {
                    Intrinsics.checkNotNull(s11, "null cannot be cast to non-null type kotlin.ByteArray");
                    iAvailable = ((byte[]) s11).length;
                }
                length3 += iAvailable;
            }
            length = length3 + this.f90509i.f90324c.length;
            LogLevel logLevel4 = LogLevel.OFF;
        }
        int length4 = length + this.f90511k.f90324c.length;
        Log log4 = Log.INSTANCE;
        LogLevel logLevel5 = LogLevel.OFF;
        LogUtils logUtils = LogUtils.INSTANCE;
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        logUtils.logServerRequest(simpleName, string);
        return length4;
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getParts$jumio_core_release$annotations() {
    }
}
