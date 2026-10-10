package com.kubi.sdk.web.model;

import androidx.annotation.Keep;
import com.kubi.p110rn.Constants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SupportPageModel.kt */
/* JADX INFO: loaded from: classes43.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/sdk/web/model/SupportPageModel;", "", "path", "", Constants.BIZ, "(Ljava/lang/String;Ljava/lang/String;)V", "getBiz", "()Ljava/lang/String;", "getPath", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class SupportPageModel {

    @Nullable
    private final String biz;

    @Nullable
    private final String path;

    /* JADX WARN: Multi-variable type inference failed */
    public SupportPageModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportPageModel)) {
            return false;
        }
        SupportPageModel supportPageModel = (SupportPageModel) other;
        return Intrinsics.areEqual(this.path, supportPageModel.path) && Intrinsics.areEqual(this.biz, supportPageModel.biz);
    }

    public SupportPageModel(@Nullable String str, @Nullable String str2) {
        this.path = str;
        this.biz = str2;
    }

    public static /* synthetic */ SupportPageModel copy$default(SupportPageModel supportPageModel, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = supportPageModel.path;
        }
        if ((i11 & 2) != 0) {
            str2 = supportPageModel.biz;
        }
        return supportPageModel.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBiz() {
        return this.biz;
    }

    @NotNull
    public final SupportPageModel copy(@Nullable String path, @Nullable String biz) {
        return new SupportPageModel(path, biz);
    }

    @Nullable
    public final String getBiz() {
        return this.biz;
    }

    @Nullable
    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        String str = this.path;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.biz;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SupportPageModel(path=" + this.path + ", biz=" + this.biz + ')';
    }

    public /* synthetic */ SupportPageModel(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }
}
