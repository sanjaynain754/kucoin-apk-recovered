package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class NotificationChannelGroupCompat {
    private boolean mBlocked;
    private List<NotificationChannelCompat> mChannels;
    String mDescription;
    final String mId;
    CharSequence mName;

    @RequiresApi(26)
    public static class Api26Impl {
        public static NotificationChannelGroup createNotificationChannelGroup(String str, CharSequence charSequence) {
            return new NotificationChannelGroup(str, charSequence);
        }

        private Api26Impl() {
        }

        public static List<NotificationChannel> getChannels(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getChannels();
        }

        public static String getGroup(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        public static String getId(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        public static CharSequence getName(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getName();
        }
    }

    public static class Builder {
        final NotificationChannelGroupCompat mGroup;

        @NonNull
        public NotificationChannelGroupCompat build() {
            return this.mGroup;
        }

        @NonNull
        public Builder setDescription(@Nullable String str) {
            this.mGroup.mDescription = str;
            return this;
        }

        @NonNull
        public Builder setName(@Nullable CharSequence charSequence) {
            this.mGroup.mName = charSequence;
            return this;
        }

        public Builder(@NonNull String str) {
            this.mGroup = new NotificationChannelGroupCompat(str);
        }
    }

    public NotificationChannelGroupCompat(@NonNull String str) {
        this.mChannels = Collections.EMPTY_LIST;
        this.mId = (String) Preconditions.checkNotNull(str);
    }

    @RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
        }

        public static String getDescription(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getDescription();
        }

        public static boolean isBlocked(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.isBlocked();
        }

        public static void setDescription(NotificationChannelGroup notificationChannelGroup, String str) {
            notificationChannelGroup.setDescription(str);
        }
    }

    @RequiresApi(26)
    private List<NotificationChannelCompat> getChannelsCompat(List<NotificationChannel> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<NotificationChannel> it = list.iterator();
        while (it.hasNext()) {
            NotificationChannel notificationChannelM2283a = C1554i.m2283a(it.next());
            if (this.mId.equals(Api26Impl.getGroup(notificationChannelM2283a))) {
                arrayList.add(new NotificationChannelCompat(notificationChannelM2283a));
            }
        }
        return arrayList;
    }

    @NonNull
    public List<NotificationChannelCompat> getChannels() {
        return this.mChannels;
    }

    @Nullable
    public String getDescription() {
        return this.mDescription;
    }

    @NonNull
    public String getId() {
        return this.mId;
    }

    @Nullable
    public CharSequence getName() {
        return this.mName;
    }

    public NotificationChannelGroup getNotificationChannelGroup() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            return null;
        }
        NotificationChannelGroup notificationChannelGroupCreateNotificationChannelGroup = Api26Impl.createNotificationChannelGroup(this.mId, this.mName);
        if (i11 >= 28) {
            Api28Impl.setDescription(notificationChannelGroupCreateNotificationChannelGroup, this.mDescription);
        }
        return notificationChannelGroupCreateNotificationChannelGroup;
    }

    public boolean isBlocked() {
        return this.mBlocked;
    }

    @NonNull
    public Builder toBuilder() {
        return new Builder(this.mId).setName(this.mName).setDescription(this.mDescription);
    }

    @RequiresApi(28)
    public NotificationChannelGroupCompat(@NonNull NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.EMPTY_LIST);
    }

    @RequiresApi(26)
    public NotificationChannelGroupCompat(@NonNull NotificationChannelGroup notificationChannelGroup, @NonNull List<NotificationChannel> list) {
        this(Api26Impl.getId(notificationChannelGroup));
        this.mName = Api26Impl.getName(notificationChannelGroup);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            this.mDescription = Api28Impl.getDescription(notificationChannelGroup);
        }
        if (i11 >= 28) {
            this.mBlocked = Api28Impl.isBlocked(notificationChannelGroup);
            this.mChannels = getChannelsCompat(Api26Impl.getChannels(notificationChannelGroup));
        } else {
            this.mChannels = getChannelsCompat(list);
        }
    }
}
