package com.facebook.react.internal;

import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: ChoreographerProvider.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m90084d2 = {"Lcom/facebook/react/internal/ChoreographerProvider;", "", "getChoreographer", "Lcom/facebook/react/internal/ChoreographerProvider$Choreographer;", "Choreographer", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface ChoreographerProvider {

    /* JADX INFO: compiled from: ChoreographerProvider.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m90084d2 = {"Lcom/facebook/react/internal/ChoreographerProvider$Choreographer;", "", "postFrameCallback", "", TUIConstants.TUIChat.CALL_BACK, "Landroid/view/Choreographer$FrameCallback;", "removeFrameCallback", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public interface Choreographer {
        void postFrameCallback(@NotNull android.view.Choreographer.FrameCallback callback);

        void removeFrameCallback(@NotNull android.view.Choreographer.FrameCallback callback);
    }

    @NotNull
    Choreographer getChoreographer();
}
