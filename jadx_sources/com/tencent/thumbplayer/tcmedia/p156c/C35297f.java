package com.tencent.thumbplayer.tcmedia.p156c;

import com.tencent.thumbplayer.tcmedia.api.proxy.ITPPreloadProxy;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.c.f */
/* JADX INFO: loaded from: classes62.dex */
public class C35297f implements ITPPreloadProxy.IPreloadListener, ITPPlayListener {

    /* JADX INFO: renamed from: a */
    private String f75939a;

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
    public String getContentType(int i11, String str) {
        return null;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
    public String getDataFilePath(int i11, String str) {
        return null;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
    public Object getPlayInfo(long j11) {
        TPLogUtil.m78800i(this.f75939a, " empty proxy player listener , notify , getPlayInfo with type : ".concat(String.valueOf(j11)));
        return null;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
    public int onReadData(int i11, String str, long j11, long j12) {
        return 0;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
    public int onStartReadData(int i11, String str, long j11, long j12) {
        return 0;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
    public int onStopReadData(int i11, String str, int i12) {
        return 0;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
    public long getAdvRemainTime() {
        TPLogUtil.m78800i(this.f75939a, " empty proxy player listener , notify , getAdvRemainTime");
        return 0L;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
    public int getCurrentPlayClipNo() {
        TPLogUtil.m78800i(this.f75939a, " empty proxy player listener , notify , getCurrentPlayClipNo");
        return 0;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
    public long[] getCurrentPlayOffset() {
        TPLogUtil.m78800i(this.f75939a, " empty proxy player listener , notify , getCurrentPlayOffset");
        return new long[]{-1, -1};
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
    public long getCurrentPosition() {
        TPLogUtil.m78800i(this.f75939a, " empty proxy player listener , notify , getCurrentPosition");
        return 0L;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
    public long getDataTotalSize(int i11, String str) {
        return 0L;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
    public Object getPlayInfo(String str) {
        TPLogUtil.m78800i(this.f75939a, " empty proxy player listener , notify , getPlayInfo with key : ".concat(String.valueOf(str)));
        return null;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
    public long getPlayerBufferLength() {
        TPLogUtil.m78800i(this.f75939a, " empty proxy player listener , notify , getPlayerBufferLength");
        return 0L;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
    public void onDownloadProgressUpdate(int i11, int i12, long j11, long j12, String str) {
        TPLogUtil.m78800i(this.f75939a, " empty proxy player listener , notify , onPlayProgress, current : " + j11 + ", total : " + j12);
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
    public Object onPlayCallback(int i11, Object obj, Object obj2, Object obj3, Object obj4) {
        TPLogUtil.m78800i(this.f75939a, " empty proxy player listener , notify , onPlayCallback, messageType : " + i11 + ",ext1:" + obj + ",ext2:" + obj2 + ",ext3" + obj3 + ",ext4" + obj4);
        return null;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.proxy.ITPPreloadProxy.IPreloadListener
    public void onPrepareError() {
        TPLogUtil.m78800i(this.f75939a, " empty proxy player listener , notify , onPrepareError : ");
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.proxy.ITPPreloadProxy.IPreloadListener
    public void onPrepareSuccess() {
        TPLogUtil.m78800i(this.f75939a, " empty proxy player listener , notify , onPrepareSuccess : ");
    }

    public C35297f(String str) {
        this.f75939a = str;
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
    public void onDownloadCdnUrlInfoUpdate(String str, String str2, String str3, String str4) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.proxy.ITPPreloadProxy.IPreloadListener
    public void onPrepareDownloadProgressUpdate(int i11, int i12, long j11, long j12) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
    public void onDownloadFinish() {
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
    public void onDownloadProtocolUpdate(String str, String str2) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
    public void onDownloadError(int i11, int i12, String str) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
    public void onDownloadCdnUrlExpired(Map<String, String> map) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
    public void onDownloadCdnUrlUpdate(String str) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
    public void onDownloadStatusUpdate(int i11) {
    }
}
