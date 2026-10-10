package com.jumio.core.camera;

import com.jumio.commons.PersistWith;
import com.jumio.core.model.StaticModel;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/jumio/core/camera/CameraManagerModel;", "Lcom/jumio/core/model/StaticModel;", "useFallback", "", "<init>", "(Z)V", "getUseFallback", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("CameraManagerModel")
public final /* data */ class CameraManagerModel implements StaticModel {

    /* JADX INFO: renamed from: a */
    public final boolean f13728a;

    public CameraManagerModel() {
        this(false, 1, null);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CameraManagerModel) && this.f13728a == ((CameraManagerModel) other).f13728a;
    }

    public CameraManagerModel(boolean z11) {
        this.f13728a = z11;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13728a);
    }

    public final String toString() {
        return "CameraManagerModel(useFallback=" + this.f13728a + ')';
    }

    public /* synthetic */ CameraManagerModel(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11);
    }
}
