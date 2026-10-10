package com.sumsub.sns.internal.fingerprint.infoproviders;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.sumsub.sns.internal.fingerprint.tools.threading.safe.AbstractC33266c;
import java.util.ArrayList;
import java.util.List;
import p852kotlin.Result;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.fingerprint.infoproviders.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33210d {

    /* JADX INFO: renamed from: a */
    public final MediaCodecList f67755a;

    /* JADX INFO: renamed from: a */
    public final List m71560a() {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.infoproviders.t
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C33210d.m71559a(this.f67789b);
            }
        });
        List listEmptyList = CollectionsKt.emptyList();
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = listEmptyList;
        }
        return (List) objM71616a;
    }

    public C33210d(MediaCodecList mediaCodecList) {
        this.f67755a = mediaCodecList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: a */
    public static final List m71559a(C33210d c33210d) {
        String name;
        ?? EmptyList;
        MediaCodecInfo[] codecInfos = c33210d.f67755a.getCodecInfos();
        ArrayList arrayList = new ArrayList(codecInfos.length);
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (mediaCodecInfo == null || (name = mediaCodecInfo.getName()) == null) {
                name = "";
            }
            String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
            if (supportedTypes != null) {
                EmptyList = new ArrayList();
                for (String str : supportedTypes) {
                    EmptyList.add(String.valueOf(str));
                }
            } else {
                EmptyList = CollectionsKt.emptyList();
            }
            arrayList.add(new C33224k(name, EmptyList));
        }
        return arrayList;
    }
}
