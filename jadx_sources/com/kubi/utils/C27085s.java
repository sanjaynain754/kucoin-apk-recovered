package com.kubi.utils;

import android.text.SpannableStringBuilder;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.utils.s */
/* JADX INFO: compiled from: DslSpannable.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0019\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\b\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001c\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/utils/s;", "Lcom/kubi/utils/r;", "", "text", "<init>", "(Ljava/lang/String;)V", "Lkotlin/Function1;", "Lcom/kubi/utils/p;", "", "Lkotlin/ExtensionFunctionType;", FirebaseAnalytics.Param.METHOD, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Landroid/text/SpannableStringBuilder;", "b", "()Landroid/text/SpannableStringBuilder;", "Landroid/text/SpannableStringBuilder;", "builder", "", "I", "getFirstIndex", "()I", "setFirstIndex", "(I)V", "firstIndex", "c", "getLastIndex", "setLastIndex", "lastIndex", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDslSpannable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DslSpannable.kt\ncom/kubi/utils/DslSpannableStringBuilderImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"})
public final class C27085s implements InterfaceC27083r {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SpannableStringBuilder builder;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int firstIndex;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int lastIndex;

    public C27085s(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.builder = new SpannableStringBuilder(text);
    }

    @Override // com.kubi.utils.InterfaceC27083r
    /* JADX INFO: renamed from: a */
    public void mo66838a(@NotNull String text, @Nullable Function1<? super InterfaceC27079p, Unit> method) {
        Object absoluteSizeSpan;
        Intrinsics.checkNotNullParameter(text, "text");
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) this.builder, text, 0, false, 6, (Object) null);
        this.firstIndex = iIndexOf$default;
        if (iIndexOf$default != -1) {
            int length = iIndexOf$default + text.length();
            this.lastIndex = length;
            if (length <= this.builder.toString().length()) {
                C27081q c27081q = new C27081q();
                if (method != null) {
                    method.invoke(c27081q);
                }
                if (c27081q.getForegroundColorSpan() != null) {
                    absoluteSizeSpan = c27081q.getForegroundColorSpan();
                } else if (c27081q.getStyleSpan() != null) {
                    absoluteSizeSpan = c27081q.getStyleSpan();
                } else if (c27081q.getOnClickSpan() != null) {
                    absoluteSizeSpan = c27081q.getOnClickSpan();
                } else if (c27081q.getUnderlineSpan() != null) {
                    absoluteSizeSpan = c27081q.getUnderlineSpan();
                } else {
                    absoluteSizeSpan = c27081q.getAbsoluteSizeSpan() != null ? c27081q.getAbsoluteSizeSpan() : null;
                }
                if (absoluteSizeSpan != null) {
                    this.builder.setSpan(absoluteSizeSpan, this.firstIndex, this.lastIndex, 18);
                }
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final SpannableStringBuilder getBuilder() {
        return this.builder;
    }
}
