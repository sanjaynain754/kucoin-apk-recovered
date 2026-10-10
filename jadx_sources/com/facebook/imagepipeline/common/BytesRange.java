package com.facebook.imagepipeline.common;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.imagepipeline.common.BytesRange;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p712w3.C45708h;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: BytesRange.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 \f2\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0000H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\tJ\u001a\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u0018"}, m90084d2 = {"Lcom/facebook/imagepipeline/common/BytesRange;", "", "", "from", TypedValues.TransitionType.S_TO, "<init>", "(II)V", "", "f", "()Ljava/lang/String;", "compare", "", "c", "(Lcom/facebook/imagepipeline/common/BytesRange;)Z", "toString", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "b", "Companion", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final /* data */ class BytesRange {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Lazy<Pattern> f8888d = LazyKt.lazy(new Function0() { // from class: r5.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BytesRange.m9180e();
        }
    });

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    public final int from;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    public final int to;

    /* JADX INFO: compiled from: BytesRange.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0007J\u001b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m90084d2 = {"Lcom/facebook/imagepipeline/common/BytesRange$Companion;", "", "<init>", "()V", "", "from", "Lcom/facebook/imagepipeline/common/BytesRange;", "(I)Lcom/facebook/imagepipeline/common/BytesRange;", TypedValues.TransitionType.S_TO, "toMax", "", "header", "fromContentRangeHeader", "(Ljava/lang/String;)Lcom/facebook/imagepipeline/common/BytesRange;", "n", "b", "(I)Ljava/lang/String;", "Ljava/util/regex/Pattern;", "headerParsingRegEx$delegate", "Lkotlin/Lazy;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/util/regex/Pattern;", "headerParsingRegEx", "TO_END_OF_CONTENT", "I", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final BytesRange toMax(int to2) {
            C45708h.m100891b(Boolean.valueOf(to2 > 0));
            return new BytesRange(0, to2);
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final BytesRange from(int from) {
            C45708h.m100891b(Boolean.valueOf(from >= 0));
            return new BytesRange(from, Integer.MAX_VALUE);
        }

        @JvmStatic
        @Nullable
        public final BytesRange fromContentRangeHeader(@Nullable String header) throws IllegalArgumentException {
            if (header == null) {
                return null;
            }
            try {
                String[] strArrSplit = m9184a().split(header);
                C45708h.m100891b(Boolean.valueOf(strArrSplit.length == 4));
                C45708h.m100891b(Boolean.valueOf(Intrinsics.areEqual(strArrSplit[0], "bytes")));
                String str = strArrSplit[1];
                Intrinsics.checkNotNullExpressionValue(str, "get(...)");
                int i11 = Integer.parseInt(str);
                String str2 = strArrSplit[2];
                Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
                int i12 = Integer.parseInt(str2);
                String str3 = strArrSplit[3];
                Intrinsics.checkNotNullExpressionValue(str3, "get(...)");
                int i13 = Integer.parseInt(str3);
                C45708h.m100891b(Boolean.valueOf(i12 > i11));
                C45708h.m100891b(Boolean.valueOf(i13 > i12));
                return i12 < i13 - 1 ? new BytesRange(i11, i12) : new BytesRange(i11, Integer.MAX_VALUE);
            } catch (IllegalArgumentException e11) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str4 = String.format(null, "Invalid Content-Range header value: \"%s\"", Arrays.copyOf(new Object[]{header}, 1));
                Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
                throw new IllegalArgumentException(str4, e11);
            }
        }

        /* JADX INFO: renamed from: a */
        public final Pattern m9184a() {
            Object value = BytesRange.f8888d.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (Pattern) value;
        }

        /* JADX INFO: renamed from: b */
        public final String m9185b(int n11) {
            if (n11 == Integer.MAX_VALUE) {
                return "";
            }
            return String.valueOf(n11);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m9182c(@Nullable BytesRange compare) {
        return compare != null && this.from <= compare.from && compare.to <= this.to;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(BytesRange.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.facebook.imagepipeline.common.BytesRange");
        BytesRange bytesRange = (BytesRange) other;
        return this.from == bytesRange.from && this.to == bytesRange.to;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final BytesRange m9179d(int i11) {
        return INSTANCE.from(i11);
    }

    /* JADX INFO: renamed from: e */
    public static final Pattern m9180e() {
        return Pattern.compile("[-/ ]");
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final BytesRange m9181g(int i11) {
        return INSTANCE.toMax(i11);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final String m9183f() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Companion companion = INSTANCE;
        String str = String.format(null, "bytes=%s-%s", Arrays.copyOf(new Object[]{companion.m9185b(this.from), companion.m9185b(this.to)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public int hashCode() {
        return (this.from * 31) + this.to;
    }

    @NotNull
    public String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Companion companion = INSTANCE;
        String str = String.format(null, "%s-%s", Arrays.copyOf(new Object[]{companion.m9185b(this.from), companion.m9185b(this.to)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public BytesRange(int i11, int i12) {
        this.from = i11;
        this.to = i12;
    }
}
