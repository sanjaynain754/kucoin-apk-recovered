package androidx.recyclerview.widget;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes34.dex */
interface ThreadUtil<T> {

    public interface BackgroundCallback<T> {
        void loadTile(int i11, int i12);

        @SuppressLint({"UnknownNullness"})
        void recycleTile(TileList.Tile<T> tile);

        void refresh(int i11);

        void updateRange(int i11, int i12, int i13, int i14, int i15);
    }

    public interface MainThreadCallback<T> {
        @SuppressLint({"UnknownNullness"})
        void addTile(int i11, TileList.Tile<T> tile);

        void removeTile(int i11, int i12);

        void updateItemCount(int i11, int i12);
    }

    BackgroundCallback<T> getBackgroundProxy(BackgroundCallback<T> backgroundCallback);

    MainThreadCallback<T> getMainThreadProxy(MainThreadCallback<T> mainThreadCallback);
}
