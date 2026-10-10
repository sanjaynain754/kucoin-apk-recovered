package p391k3;

import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import com.facebook.appevents.p060ml.MTensor;
import com.tencent.bugly.proguard.C33627eb;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Charsets;
import p852kotlin.text.Regex;

/* JADX INFO: renamed from: k3.g */
/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m90084d2 = {"Lk3/g;", "", "<init>", "()V", "Ljava/io/File;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/io/File;", "file", "", "", "Lcom/facebook/appevents/ml/MTensor;", "c", "(Ljava/io/File;)Ljava/util/Map;", "texts", "", "maxLen", "", "d", "(Ljava/lang/String;I)[I", "str", "b", "(Ljava/lang/String;)Ljava/lang/String;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncom/facebook/appevents/ml/Utils\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,126:1\n107#2:127\n79#2,22:128\n37#3,2:150\n*S KotlinDebug\n*F\n+ 1 Utils.kt\ncom/facebook/appevents/ml/Utils\n*L\n43#1:127\n43#1:128,22\n44#1:150,2\n*E\n"})
public final class C40878g {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C40878g f90890a = new C40878g();

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final File m89473a() {
        if (C42757a.m93689d(C40878g.class)) {
            return null;
        }
        try {
            File file = new File(C5501a.m7799m().getFilesDir(), "facebook_ml/");
            if (file.exists() || file.mkdirs()) {
                return file;
            }
            return null;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C40878g.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final Map<String, MTensor> m89474c(@NotNull File file) {
        Map<String, MTensor> map;
        Map<String, MTensor> map2 = null;
        if (C42757a.m93689d(C40878g.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(file, "file");
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                int iAvailable = fileInputStream.available();
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                byte[] bArr = new byte[iAvailable];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                if (iAvailable < 4) {
                    return null;
                }
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, 4);
                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                int i11 = byteBufferWrap.getInt();
                int i12 = i11 + 4;
                if (iAvailable < i12) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(new String(bArr, 4, i11, Charsets.UTF_8));
                JSONArray jSONArrayNames = jSONObject.names();
                int length = jSONArrayNames.length();
                String[] strArr = new String[length];
                for (int i13 = 0; i13 < length; i13++) {
                    strArr[i13] = jSONArrayNames.getString(i13);
                }
                ArraysKt.sort((Object[]) strArr);
                HashMap map3 = new HashMap();
                int i14 = 0;
                while (i14 < length) {
                    String str = strArr[i14];
                    if (str == null) {
                        map = map2;
                    } else {
                        JSONArray jSONArray = jSONObject.getJSONArray(str);
                        int length2 = jSONArray.length();
                        int[] iArr = new int[length2];
                        int i15 = 1;
                        map = map2;
                        for (int i16 = 0; i16 < length2; i16++) {
                            try {
                                int i17 = jSONArray.getInt(i16);
                                iArr[i16] = i17;
                                i15 *= i17;
                            } catch (Exception unused) {
                                return map;
                            } catch (Throwable th2) {
                                th = th2;
                                C42757a.m93687b(th, C40878g.class);
                                return map;
                            }
                        }
                        int i18 = i15 * 4;
                        int i19 = i12 + i18;
                        if (i19 > iAvailable) {
                            return map;
                        }
                        ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr, i12, i18);
                        byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
                        MTensor mTensor = new MTensor(iArr);
                        byteBufferWrap2.asFloatBuffer().get(mTensor.getData(), 0, i15);
                        map3.put(str, mTensor);
                        i12 = i19;
                    }
                    i14++;
                    map2 = map;
                }
                return map3;
            } catch (Exception unused2) {
                return map2;
            }
        } catch (Throwable th3) {
            th = th3;
            map = map2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m89475b(@NotNull String str) {
        int i11;
        boolean z11;
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(str, "str");
            int length = str.length() - 1;
            int i12 = 0;
            boolean z12 = false;
            while (i12 <= length) {
                if (!z12) {
                    i11 = i12;
                } else {
                    i11 = length;
                }
                if (Intrinsics.compare((int) str.charAt(i11), 32) <= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z12) {
                    if (!z11) {
                        z12 = true;
                    } else {
                        i12++;
                    }
                } else {
                    if (!z11) {
                        break;
                    }
                    length--;
                }
            }
            String strJoin = TextUtils.join(C33627eb.f69716f, (String[]) new Regex("\\s+").split(str.subSequence(i12, length + 1).toString(), 0).toArray(new String[0]));
            Intrinsics.checkNotNullExpressionValue(strJoin, "join(\" \", strArray)");
            return strJoin;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final int[] m89476d(@NotNull String texts, int maxLen) {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(texts, "texts");
            int[] iArr = new int[maxLen];
            String strM89475b = m89475b(texts);
            Charset charsetForName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(\"UTF-8\")");
            byte[] bytes = strM89475b.getBytes(charsetForName);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            for (int i11 = 0; i11 < maxLen; i11++) {
                if (i11 < bytes.length) {
                    iArr[i11] = bytes[i11] & 255;
                } else {
                    iArr[i11] = 0;
                }
            }
            return iArr;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }
}
