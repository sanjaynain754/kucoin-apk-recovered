package com.kubi.mvi.state;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.mvi.state.InterfaceC19284f;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.mvi.state.m */
/* JADX INFO: compiled from: Simple.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068\u0014X\u0094D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m90084d2 = {"Lcom/kubi/mvi/state/m;", "Lcom/kubi/mvi/state/f;", ExifInterface.LATITUDE_SOUTH, "Lcom/kubi/mvi/state/l;", "<init>", "()V", "", ExifInterface.LONGITUDE_WEST, "I", "getDefaultThreadMode", "()I", "defaultThreadMode", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class AbstractC19291m<S extends InterfaceC19284f> extends AbstractC19290l<S> {

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public final int defaultThreadMode = 2;

    @Override // com.kubi.mvi.state.BaseStateVM
    public int getDefaultThreadMode() {
        return this.defaultThreadMode;
    }
}
