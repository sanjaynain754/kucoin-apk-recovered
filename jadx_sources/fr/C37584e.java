package fr;

import androidx.media3.exoplayer.upstream.CmcdData;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: fr.e */
/* JADX INFO: compiled from: IConnectCallback.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003R\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\f¨\u0006\u000e"}, m90084d2 = {"Lfr/e;", "Lfr/d;", "<init>", "()V", "", "onDisconnect", "onConnecting", "onConnected", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "c", "", "Z", "isConnected", "network-api_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public class C37584e implements InterfaceC37583d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean isConnected;

    /* JADX INFO: renamed from: a */
    public void mo84723a() {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public final void m84725c() {
        if (this.isConnected) {
            mo84723a();
        } else {
            m84724b();
        }
    }

    @Override // fr.InterfaceC37583d
    public final void onConnected() {
        if (this.isConnected) {
            return;
        }
        this.isConnected = true;
        m84725c();
    }

    @Override // fr.InterfaceC37583d
    public final void onDisconnect() {
        if (this.isConnected) {
            this.isConnected = false;
            m84725c();
        }
    }

    @Override // fr.InterfaceC37583d
    public final void onConnecting() {
        onDisconnect();
    }

    /* JADX INFO: renamed from: b */
    public void m84724b() {
    }
}
