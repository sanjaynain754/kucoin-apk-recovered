package sh;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: sh.a, reason: from toString */
/* JADX INFO: compiled from: EuropeComplianceLangEntity.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/futures/data/compliance/entity/EuropeComplianceLangEntity;", "", "lang", "", "langText", "checked", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getLang", "()Ljava/lang/String;", "getLangText", "getChecked", "()Z", "setChecked", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class EuropeComplianceLangEntity {

    /* JADX INFO: renamed from: a, reason: from toString */
    @Nullable
    public final String lang;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final String langText;

    /* JADX INFO: renamed from: c, reason: from toString */
    public boolean checked;

    public EuropeComplianceLangEntity() {
        this(null, null, false, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EuropeComplianceLangEntity)) {
            return false;
        }
        EuropeComplianceLangEntity europeComplianceLangEntity = (EuropeComplianceLangEntity) other;
        return Intrinsics.areEqual(this.lang, europeComplianceLangEntity.lang) && Intrinsics.areEqual(this.langText, europeComplianceLangEntity.langText) && this.checked == europeComplianceLangEntity.checked;
    }

    public EuropeComplianceLangEntity(@Nullable String str, @Nullable String str2, boolean z11) {
        this.lang = str;
        this.langText = str2;
        this.checked = z11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getChecked() {
        return this.checked;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLang() {
        return this.lang;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLangText() {
        return this.langText;
    }

    /* JADX INFO: renamed from: d */
    public final void m97945d(boolean z11) {
        this.checked = z11;
    }

    public int hashCode() {
        String str = this.lang;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.langText;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.checked);
    }

    @NotNull
    public String toString() {
        return "EuropeComplianceLangEntity(lang=" + this.lang + ", langText=" + this.langText + ", checked=" + this.checked + ')';
    }

    public /* synthetic */ EuropeComplianceLangEntity(String str, String str2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? false : z11);
    }
}
