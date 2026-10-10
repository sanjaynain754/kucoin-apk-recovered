package com.otaliastudios.transcoder.internal.pipeline;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.otaliastudios.transcoder.internal.pipeline.d */
/* JADX INFO: compiled from: Pipeline.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0080\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\t\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002\"\b\b\u0002\u0010\u0004*\u00020\u0000\"\b\b\u0003\u0010\u0005*\u00020\u0002*\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00062\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006H\u0080\u0002¢\u0006\u0004\b\n\u0010\u000b*<\b\u0002\u0010\f\"\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00062\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0006¨\u0006\r"}, m90084d2 = {"", "CurrData", "Lcom/otaliastudios/transcoder/internal/pipeline/b;", "CurrChannel", "NewData", "NewChannel", "Lcom/otaliastudios/transcoder/internal/pipeline/g;", "", "other", "Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$a;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/otaliastudios/transcoder/internal/pipeline/g;Lcom/otaliastudios/transcoder/internal/pipeline/g;)Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline$a;", "AnyStep", "lib_release"}, m90085k = 2, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C27358d {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <CurrData, CurrChannel extends InterfaceC27356b, NewData, NewChannel extends InterfaceC27356b> Pipeline.C27353a<NewData, NewChannel> m68052a(@NotNull InterfaceC27361g<Unit, InterfaceC27356b, CurrData, CurrChannel> interfaceC27361g, @NotNull InterfaceC27361g<CurrData, CurrChannel, NewData, NewChannel> other) {
        Intrinsics.checkNotNullParameter(interfaceC27361g, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new Pipeline.C27353a(CollectionsKt.listOf(interfaceC27361g)).m68044b(other);
    }
}
