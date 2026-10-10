package com.kubi.payment.util;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import androidx.core.content.res.ResourcesCompat;
import com.kubi.host.HostManager;
import com.kubi.utils.C27054i0;
import com.kubi.utils.C27059l;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33844oi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p694vk.C45590s;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.payment.util.k, reason: from Kotlin metadata */
/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/payment/util/Utils;", "", "<init>", "()V", "isProduce", "", "isDebug", "getPath", "", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "createColorTypefaceSpan", "Landroid/text/style/CharacterStyle;", "fontResId", "", "color", "textSize", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncom/kubi/payment/util/Utils\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,143:1\n37#2:144\n36#2,3:145\n*S KotlinDebug\n*F\n+ 1 Utils.kt\ncom/kubi/payment/util/Utils\n*L\n46#1:144\n46#1:145,3\n*E\n"})
public final class Utils {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Utils f40393a = new Utils();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final CharacterStyle m49849a(int i11, int i12, float f11) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Typeface font = ResourcesCompat.getFont(C27059l.f54343a.m66757a(), i11);
            objM103844constructorimpl = Result.m103844constructorimpl(font != null ? new CustomColorTypefaceSizeSpan(i12, font, f11) : new ForegroundColorSpan(i12));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return objM103844constructorimpl != null ? (CharacterStyle) objM103844constructorimpl : new ForegroundColorSpan(i12);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final String m49850b(@NotNull Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            if (!DocumentsContract.isDocumentUri(context, uri)) {
                if (StringsKt.equals("content", uri.getScheme(), true)) {
                    return C27054i0.m66738b(context, uri, null, null);
                }
                if (StringsKt.equals("file", uri.getScheme(), true)) {
                    return uri.getPath();
                }
                return null;
            }
            if (C27054i0.m66742f(uri)) {
                String documentId = DocumentsContract.getDocumentId(uri);
                Intrinsics.checkNotNull(documentId);
                String[] strArr = (String[]) StringsKt.split$default((CharSequence) documentId, new String[]{C33844oi.f71346o}, false, 0, 6, (Object) null).toArray(new String[0]);
                if (StringsKt.equals("primary", strArr[0], true)) {
                    return Environment.getExternalStorageDirectory().getAbsolutePath() + '/' + strArr[1];
                }
            }
            return null;
        } catch (Exception e11) {
            C44128b.m97261e("Utils-getPath", C27041f.m66668h(e11.getMessage()));
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m49851c() {
        C45590s c45590s = C45590s.f102687a;
        return !c45590s.m100680e0() && c45590s.m100666Q();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m49852d() {
        return Intrinsics.areEqual(HostManager.a.y(), "produce");
    }
}
