package com.kubi.mvi.state;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.mvi.state.InterfaceC19284f;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.mvi.state.l */
/* JADX INFO: compiled from: Simple.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00078\u0014X\u0094D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m90084d2 = {"Lcom/kubi/mvi/state/l;", "Lcom/kubi/mvi/state/f;", ExifInterface.LATITUDE_SOUTH, "Lcom/kubi/mvi/state/BaseStateVM;", "Lcom/kubi/mvi/state/d;", "<init>", "()V", "", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Z", "getNeedCatchException", "()Z", "needCatchException", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class AbstractC19290l<S extends InterfaceC19284f> extends BaseStateVM<InterfaceC19282d, S> {

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public final boolean needCatchException = true;

    @Override // com.kubi.mvi.state.BaseStateVM
    public boolean getNeedCatchException() {
        return this.needCatchException;
    }
}
