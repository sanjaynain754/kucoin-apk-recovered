package com.kubi.sdk;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import androidx.core.content.ContextCompat;
import com.tencent.bugly.proguard.C33627eb;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.sdk.m3 */
/* JADX INFO: compiled from: ViewExtension.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, m90084d2 = {"appendEndIcon", "", "", "context", "Landroid/content/Context;", "arrowId", "", "verticalAlignment", "LBase_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nViewExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewExtension.kt\ncom/kubi/sdk/ViewExtensionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n1#2:38\n*E\n"})
public final class C23889m3 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final CharSequence m57251a(@NotNull String str, @NotNull Context context, int i11, int i12) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        Drawable drawable = ContextCompat.getDrawable(context, i11);
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        ImageSpan imageSpan = drawable != null ? new ImageSpan(drawable, i12) : null;
        spannableStringBuilder.append((CharSequence) C33627eb.f69716f);
        if (imageSpan != null) {
            spannableStringBuilder.setSpan(imageSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ CharSequence m57252b(String str, Context context, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = R$drawable.ic2_arrow_right_16;
        }
        if ((i13 & 4) != 0) {
            i12 = 0;
        }
        return m57251a(str, context, i11, i12);
    }
}
