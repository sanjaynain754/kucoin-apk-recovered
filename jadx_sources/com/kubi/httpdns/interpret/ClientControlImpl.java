package com.kubi.httpdns.interpret;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.httpdns.HttpDnsConfig;
import com.kubi.otc.entity.OtcAd;
import org.jetbrains.annotations.NotNull;
import p234ek.C37203a;
import p234ek.C37210h;
import p234ek.InterfaceC37204b;
import p234ek.InterfaceC37205c;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ClientControlImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/httpdns/interpret/ClientControlImpl;", "Lek/b;", "Lek/c;", "Lcom/kubi/httpdns/HttpDnsConfig;", "config", "<init>", "(Lcom/kubi/httpdns/HttpDnsConfig;)V", "d", "()Lek/c;", "", "b", "()V", "c", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/kubi/httpdns/HttpDnsConfig;", "Lcom/kubi/httpdns/interpret/ClientControlImpl$Status;", "Lcom/kubi/httpdns/interpret/ClientControlImpl$Status;", "currentStatus", "Lek/h;", "Lek/h;", "normalCategory", "Lek/a;", "Lek/a;", "gloomyCategory", "Status", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class ClientControlImpl implements InterfaceC37204b<InterfaceC37205c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final HttpDnsConfig config;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public Status currentStatus;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C37210h normalCategory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C37203a gloomyCategory;

    /* JADX INFO: compiled from: ClientControlImpl.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/httpdns/interpret/ClientControlImpl$Status;", "", "(Ljava/lang/String;I)V", OtcAd.STATUS_NORMAL, "PRE_GLOOMY", "GLOOMY", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public enum Status {
        NORMAL,
        PRE_GLOOMY,
        GLOOMY
    }

    /* JADX INFO: renamed from: com.kubi.httpdns.interpret.ClientControlImpl$a */
    /* JADX INFO: compiled from: ClientControlImpl.kt */
    /* JADX INFO: loaded from: classes16.dex */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public /* synthetic */ class C15196a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.PRE_GLOOMY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ClientControlImpl(@NotNull HttpDnsConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
        this.currentStatus = Status.NORMAL;
        C37210h c37210h = new C37210h(config, this);
        this.normalCategory = c37210h;
        this.gloomyCategory = new C37203a(config, c37210h);
    }

    @Override // p234ek.InterfaceC37204b
    /* JADX INFO: renamed from: b */
    public void mo31470b() {
        Status status;
        int i11 = C15196a.$EnumSwitchMapping$0[this.currentStatus.ordinal()];
        if (i11 != 1) {
            status = i11 != 2 ? this.currentStatus : Status.GLOOMY;
        } else {
            status = Status.PRE_GLOOMY;
        }
        this.currentStatus = status;
    }

    @Override // p234ek.InterfaceC37204b
    /* JADX INFO: renamed from: c */
    public void mo31471c() {
        this.gloomyCategory.m83242b();
        this.currentStatus = Status.NORMAL;
    }

    @Override // p234ek.InterfaceC37204b
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceC37205c mo31469a() {
        return this.currentStatus == Status.GLOOMY ? this.gloomyCategory : this.normalCategory;
    }
}
