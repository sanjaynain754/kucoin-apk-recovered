package com.sumsub.sns.internal.features.presentation.main;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.core.presentation.intro.IntroScene;
import com.sumsub.sns.internal.features.data.model.common.C29697t2;
import com.sumsub.sns.internal.features.data.model.common.Document;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.X */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31231X extends AbstractC31234Y {

    @NotNull
    public static final Parcelable.Creator<C31231X> CREATOR = new C31228W();

    /* JADX INFO: renamed from: c */
    public final List f63185c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31231X) && Intrinsics.areEqual(this.f63185c, ((C31231X) obj).f63185c);
    }

    public C31231X(List list) {
        super(new C29697t2("VIDEO_IDENT", IntroScene.VIDEO_IDENT.getSceneName(), (String) null, (String) null, (Map) null, 60), 2);
        this.f63185c = list;
    }

    public final int hashCode() {
        return this.f63185c.hashCode();
    }

    public final String toString() {
        return "VideoIdent(docs=" + this.f63185c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        List list = this.f63185c;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Document) it.next()).writeToParcel(parcel, i11);
        }
    }
}
