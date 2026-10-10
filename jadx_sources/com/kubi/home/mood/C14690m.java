package com.kubi.home.mood;

import com.kubi.home.entity.MoodInfoEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.home.mood.m */
/* JADX INFO: compiled from: MoodCardContract.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/home/mood/MoodCardContract$CardDataEvent;", "Lcom/kubi/mvi/event/ISingleEvent;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/home/entity/MoodInfoEntity;", "<init>", "(Lcom/kubi/home/entity/MoodInfoEntity;)V", "getEntity", "()Lcom/kubi/home/entity/MoodInfoEntity;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C14690m implements InterfaceC36952a {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final MoodInfoEntity f25873a;

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final MoodInfoEntity getF25873a() {
        return this.f25873a;
    }

    public C14690m(@Nullable MoodInfoEntity moodInfoEntity) {
        this.f25873a = moodInfoEntity;
    }
}
