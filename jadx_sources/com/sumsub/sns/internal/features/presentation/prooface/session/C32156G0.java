package com.sumsub.sns.internal.features.presentation.prooface.session;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Base64;
import android.util.Size;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.domain.facedetector.C28569o;
import com.sumsub.sns.internal.features.data.model.prooface.C29798A;
import com.sumsub.sns.internal.features.data.model.prooface.C29818c;
import com.sumsub.sns.internal.features.data.model.prooface.C29828l;
import com.sumsub.sns.internal.features.data.model.prooface.C29837u;
import com.sumsub.sns.internal.features.data.model.prooface.C29840x;
import com.sumsub.sns.internal.features.data.model.prooface.LivenessMessageType;
import com.sumsub.sns.internal.features.data.network.prooface.AbstractC29902q;
import com.sumsub.sns.internal.features.data.network.prooface.C29886a;
import com.sumsub.sns.internal.features.presentation.prooface.C31984A1;
import com.sumsub.sns.internal.log.C33272c;
import com.tencent.bugly.proguard.C33627eb;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlinx.coroutines.C41783z1;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.text.Charsets;
import xg0.AbstractC46162a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.G0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32156G0 {

    /* JADX INFO: renamed from: g */
    public static final SimpleDateFormat f65464g = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

    /* JADX INFO: renamed from: a */
    public final AbstractC46162a f65465a;

    /* JADX INFO: renamed from: b */
    public final C29886a f65466b;

    /* JADX INFO: renamed from: c */
    public final String f65467c;

    /* JADX INFO: renamed from: d */
    public final C31984A1 f65468d;

    /* JADX INFO: renamed from: e */
    public final C32236q f65469e;

    /* JADX INFO: renamed from: f */
    public final String f65470f = "msdk2 / 1.46.0 (Android " + Build.VERSION.RELEASE + ") - App " + C28468k0.f57986d + C33627eb.f69716f + C28468k0.f57984b + " / " + C28468k0.f57985c;

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: a */
    public final Object m71047a(Bitmap bitmap, Size size, String str, C29818c c29818c, ContinuationImpl continuationImpl) throws IOException {
        C32154F0 c32154f0;
        byte[] bArrM69946a;
        AbstractC46162a abstractC46162a;
        String strM69349b;
        Integer numBoxInt;
        Integer numBoxInt2;
        Integer numBoxInt3;
        C29828l c29828l;
        String str2;
        C29818c c29818c2;
        String str3;
        Object obj;
        Integer num;
        String str4;
        C28569o c28569o;
        String str5;
        byte[] bArr;
        int i11;
        long j11;
        if (continuationImpl instanceof C32154F0) {
            c32154f0 = (C32154F0) continuationImpl;
            int i12 = c32154f0.f65462s;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c32154f0.f65462s = i12 - Integer.MIN_VALUE;
            } else {
                c32154f0 = new C32154F0(this, continuationImpl);
            }
        } else {
            c32154f0 = new C32154F0(this, continuationImpl);
        }
        Object obj2 = c32154f0.f65460q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c32154f0.f65462s;
        if (i13 == 0) {
            ResultKt.throwOnFailure(obj2);
            try {
                bArrM69946a = AbstractC29902q.m69946a(ByteBuffer.wrap(Base64.decode(this.f65467c, 2)).getLong(0));
            } catch (Exception e11) {
                String message = e11.getMessage();
                if (message == null) {
                    message = "";
                }
                C33272c.f67816e.f67810a.mo68955d("Prooface", message, e11);
                this.f65468d.f65025a.m71017a(e11);
                AtomicLong atomicLong = AbstractC29902q.f60022a;
                bArrM69946a = AbstractC29902q.m69946a(System.nanoTime());
            }
            byte b11 = bArrM69946a[0];
            long j12 = ByteBuffer.wrap(bArrM69946a).getLong(0);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 92, byteArrayOutputStream);
            bitmap.getWidth();
            bitmap.getHeight();
            C28569o c28569o2 = new C28569o(byteArrayOutputStream.toByteArray());
            byteArrayOutputStream.close();
            abstractC46162a = this.f65465a;
            String str6 = this.f65470f;
            strM69349b = AbstractC28458h.m69349b();
            numBoxInt = Boxing.boxInt(size.getWidth());
            numBoxInt2 = Boxing.boxInt(size.getHeight());
            String str7 = f65464g.format(Calendar.getInstance().getTime());
            Integer numBoxInt4 = Boxing.boxInt(width);
            numBoxInt3 = Boxing.boxInt(height);
            C29828l c29828l2 = new C29828l(str);
            C32236q c32236q = this.f65469e;
            c32154f0.f65444a = bArrM69946a;
            c32154f0.f65445b = c28569o2;
            c32154f0.f65446c = abstractC46162a;
            c32154f0.f65447d = str6;
            c32154f0.f65448e = "Built-in front camera";
            c32154f0.f65449f = strM69349b;
            c32154f0.f65450g = numBoxInt;
            c32154f0.f65451h = numBoxInt2;
            byte[] bArr2 = bArrM69946a;
            c32154f0.f65452i = "user";
            c32154f0.f65453j = str7;
            c32154f0.f65454k = numBoxInt4;
            c32154f0.f65455l = numBoxInt3;
            c32154f0.f65456m = c29828l2;
            c32154f0.f65457n = c29818c;
            c32154f0.f65458o = b11;
            c32154f0.f65459p = j12;
            c32154f0.f65462s = 1;
            Object objM71063a = c32236q.m71063a(c32154f0);
            if (objM71063a == coroutine_suspended) {
                return coroutine_suspended;
            }
            c29828l = c29828l2;
            str2 = str7;
            c29818c2 = c29818c;
            str3 = "user";
            obj = objM71063a;
            num = numBoxInt4;
            str4 = "Built-in front camera";
            c28569o = c28569o2;
            str5 = str6;
            bArr = bArr2;
            i11 = b11;
            j11 = j12;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j13 = c32154f0.f65459p;
            i11 = c32154f0.f65458o;
            C29818c c29818c3 = c32154f0.f65457n;
            C29828l c29828l3 = c32154f0.f65456m;
            numBoxInt3 = c32154f0.f65455l;
            Integer num2 = c32154f0.f65454k;
            String str8 = c32154f0.f65453j;
            String str9 = c32154f0.f65452i;
            numBoxInt2 = c32154f0.f65451h;
            numBoxInt = c32154f0.f65450g;
            strM69349b = c32154f0.f65449f;
            String str10 = c32154f0.f65448e;
            obj = obj2;
            String str11 = c32154f0.f65447d;
            AbstractC46162a abstractC46162a2 = c32154f0.f65446c;
            C28569o c28569o3 = c32154f0.f65445b;
            byte[] bArr3 = c32154f0.f65444a;
            ResultKt.throwOnFailure(obj);
            str5 = str11;
            str4 = str10;
            c29818c2 = c29818c3;
            c29828l = c29828l3;
            num = num2;
            str2 = str8;
            str3 = str9;
            abstractC46162a = abstractC46162a2;
            j11 = j13;
            bArr = bArr3;
            c28569o = c28569o3;
        }
        C29840x c29840x = new C29840x(str5, str4, strM69349b, numBoxInt, numBoxInt2, str3, str2, num, numBoxInt3, c29828l, c29818c2, (Map) obj);
        abstractC46162a.getSerializersModule();
        byte[] bytes = abstractC46162a.mo99409b(C29840x.Companion.serializer(), c29840x).getBytes(Charsets.UTF_8);
        C41783z1.m91406l(c32154f0.get$context());
        AtomicLong atomicLong2 = AbstractC29902q.f60022a;
        byte b12 = (byte) i11;
        byte[] bArrM69947a = AbstractC29902q.m69947a(bytes, bytes.length, b12, j11);
        C41783z1.m91406l(c32154f0.get$context());
        byte[] bArr4 = c28569o.f58131a;
        byte[] bArrM69947a2 = AbstractC29902q.m69947a(bArr4, bArr4.length, b12, j11);
        C41783z1.m91406l(c32154f0.get$context());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrM69947a.length + bArrM69947a2.length + 8);
        byteBufferAllocate.putInt(bArrM69947a.length);
        byteBufferAllocate.put(bArrM69947a);
        byteBufferAllocate.putInt(bArrM69947a2.length);
        byteBufferAllocate.put(bArrM69947a2);
        String strEncodeToString = Base64.encodeToString(this.f65466b.m69941a(byteBufferAllocate.array(), bArr), 2);
        C41783z1.m91406l(c32154f0.get$context());
        return new C29798A(LivenessMessageType.livenessFragment.getType(), null, new C29837u(strEncodeToString), 26);
    }

    public C32156G0(AbstractC46162a abstractC46162a, C29886a c29886a, String str, C31984A1 c31984a1, C32236q c32236q) {
        this.f65465a = abstractC46162a;
        this.f65466b = c29886a;
        this.f65467c = str;
        this.f65468d = c31984a1;
        this.f65469e = c32236q;
    }
}
