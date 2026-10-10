package shark;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: shark.p */
/* JADX INFO: compiled from: ReferenceMatcher.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0004R#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001b"}, m90084d2 = {"Lshark/p;", "Lshark/u;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lshark/ReferencePattern;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lshark/ReferencePattern;", "()Lshark/ReferencePattern;", "pattern", "b", "Ljava/lang/String;", TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "Lkotlin/Function1;", "Lshark/i;", "c", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "patternApplies", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
public final /* data */ class C44494p extends AbstractC44499u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ReferencePattern pattern;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String description;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Function1<InterfaceC44456i, Boolean> patternApplies;

    @Override // shark.AbstractC44499u
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public ReferencePattern getPattern() {
        return this.pattern;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Function1<InterfaceC44456i, Boolean> m98456c() {
        return this.patternApplies;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C44494p)) {
            return false;
        }
        C44494p c44494p = (C44494p) other;
        return Intrinsics.areEqual(getPattern(), c44494p.getPattern()) && Intrinsics.areEqual(this.description, c44494p.description) && Intrinsics.areEqual(this.patternApplies, c44494p.patternApplies);
    }

    @NotNull
    public String toString() {
        return "library leak: " + getPattern();
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        ReferencePattern pattern = getPattern();
        int iHashCode3 = 0;
        if (pattern != null) {
            iHashCode = pattern.hashCode();
        } else {
            iHashCode = 0;
        }
        int i11 = iHashCode * 31;
        String str = this.description;
        if (str != null) {
            iHashCode2 = str.hashCode();
        } else {
            iHashCode2 = 0;
        }
        int i12 = (i11 + iHashCode2) * 31;
        Function1<InterfaceC44456i, Boolean> function1 = this.patternApplies;
        if (function1 != null) {
            iHashCode3 = function1.hashCode();
        }
        return i12 + iHashCode3;
    }
}
