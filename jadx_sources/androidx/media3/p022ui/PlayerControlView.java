package androidx.media3.p022ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import androidx.media3.common.C2711C;
import androidx.media3.common.Format;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.RepeatModeUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public class PlayerControlView extends FrameLayout {
    public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
    public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
    public static final int DEFAULT_TIME_BAR_MIN_UPDATE_INTERVAL_MS = 200;
    private static final int MAX_UPDATE_INTERVAL_MS = 1000;
    public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;
    private static final float[] PLAYBACK_SPEEDS;
    private static final int SETTINGS_AUDIO_TRACK_SELECTION_POSITION = 1;
    private static final int SETTINGS_PLAYBACK_SPEED_POSITION = 0;
    private long[] adGroupTimesMs;

    @Nullable
    private final View audioTrackButton;
    private final AudioTrackSelectionAdapter audioTrackSelectionAdapter;
    private final float buttonAlphaDisabled;
    private final float buttonAlphaEnabled;
    private final ComponentListener componentListener;
    private final PlayerControlViewLayoutManager controlViewLayoutManager;
    private long currentWindowOffset;

    @Nullable
    private final TextView durationView;
    private long[] extraAdGroupTimesMs;
    private boolean[] extraPlayedAdGroups;

    @Nullable
    private final View fastForwardButton;

    @Nullable
    private final TextView fastForwardButtonTextView;
    private final StringBuilder formatBuilder;
    private final Formatter formatter;

    @Nullable
    private final ImageView fullscreenButton;
    private final String fullscreenEnterContentDescription;
    private final Drawable fullscreenEnterDrawable;
    private final String fullscreenExitContentDescription;
    private final Drawable fullscreenExitDrawable;
    private boolean isAttachedToWindow;
    private boolean isFullscreen;

    @Nullable
    private final ImageView minimalFullscreenButton;
    private boolean multiWindowTimeBar;
    private boolean needToHideBars;

    @Nullable
    private final ImageView nextButton;

    @Nullable
    private OnFullScreenModeChangedListener onFullScreenModeChangedListener;
    private final Drawable pauseButtonDrawable;
    private final Timeline.Period period;
    private final Drawable playButtonDrawable;

    @Nullable
    private final ImageView playPauseButton;
    private final PlaybackSpeedAdapter playbackSpeedAdapter;

    @Nullable
    private final View playbackSpeedButton;
    private boolean[] playedAdGroups;

    @Nullable
    private Player player;

    @Nullable
    private final TextView positionView;

    @Nullable
    private final ImageView previousButton;

    @Nullable
    private ProgressUpdateListener progressUpdateListener;
    private final String repeatAllButtonContentDescription;
    private final Drawable repeatAllButtonDrawable;
    private final String repeatOffButtonContentDescription;
    private final Drawable repeatOffButtonDrawable;
    private final String repeatOneButtonContentDescription;
    private final Drawable repeatOneButtonDrawable;

    @Nullable
    private final ImageView repeatToggleButton;
    private int repeatToggleModes;
    private final Resources resources;

    @Nullable
    private final View rewindButton;

    @Nullable
    private final TextView rewindButtonTextView;
    private boolean scrubbing;
    private final SettingsAdapter settingsAdapter;

    @Nullable
    private final View settingsButton;
    private final RecyclerView settingsView;
    private final PopupWindow settingsWindow;
    private final int settingsWindowMargin;
    private boolean showMultiWindowTimeBar;
    private boolean showPlayButtonIfSuppressed;
    private int showTimeoutMs;

    @Nullable
    private final ImageView shuffleButton;
    private final Drawable shuffleOffButtonDrawable;
    private final String shuffleOffContentDescription;
    private final Drawable shuffleOnButtonDrawable;
    private final String shuffleOnContentDescription;

    @Nullable
    private final ImageView subtitleButton;
    private final Drawable subtitleOffButtonDrawable;
    private final String subtitleOffContentDescription;
    private final Drawable subtitleOnButtonDrawable;
    private final String subtitleOnContentDescription;
    private final TextTrackSelectionAdapter textTrackSelectionAdapter;

    @Nullable
    private final TimeBar timeBar;
    private int timeBarMinUpdateIntervalMs;
    private final TrackNameProvider trackNameProvider;
    private final Runnable updateProgressAction;
    private final CopyOnWriteArrayList<VisibilityListener> visibilityListeners;

    @Nullable
    private final ImageView vrButton;
    private final Timeline.Window window;

    public final class AudioTrackSelectionAdapter extends TrackSelectionAdapter {
        private AudioTrackSelectionAdapter() {
            super();
        }

        private boolean hasSelectionOverride(TrackSelectionParameters trackSelectionParameters) {
            for (int i11 = 0; i11 < this.tracks.size(); i11++) {
                if (trackSelectionParameters.overrides.containsKey(this.tracks.get(i11).trackGroup.getMediaTrackGroup())) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ void m3554h(AudioTrackSelectionAdapter audioTrackSelectionAdapter, View view) {
            if (PlayerControlView.this.player == null || !PlayerControlView.this.player.isCommandAvailable(29)) {
                return;
            }
            ((Player) Util.castNonNull(PlayerControlView.this.player)).setTrackSelectionParameters(PlayerControlView.this.player.getTrackSelectionParameters().buildUpon().clearOverridesOfType(1).setTrackTypeDisabled(1, false).build());
            PlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, PlayerControlView.this.getResources().getString(C3627R.string.exo_track_selection_auto));
            PlayerControlView.this.settingsWindow.dismiss();
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public void init(List<TrackInformation> list) {
            this.tracks = list;
            TrackSelectionParameters trackSelectionParameters = ((Player) Assertions.checkNotNull(PlayerControlView.this.player)).getTrackSelectionParameters();
            if (list.isEmpty()) {
                PlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, PlayerControlView.this.getResources().getString(C3627R.string.exo_track_selection_none));
                return;
            }
            if (!hasSelectionOverride(trackSelectionParameters)) {
                PlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, PlayerControlView.this.getResources().getString(C3627R.string.exo_track_selection_auto));
                return;
            }
            for (int i11 = 0; i11 < list.size(); i11++) {
                TrackInformation trackInformation = list.get(i11);
                if (trackInformation.isSelected()) {
                    PlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, trackInformation.trackName);
                    return;
                }
            }
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public void onBindViewHolderAtZeroPosition(SubSettingViewHolder subSettingViewHolder) {
            subSettingViewHolder.textView.setText(C3627R.string.exo_track_selection_auto);
            subSettingViewHolder.checkView.setVisibility(hasSelectionOverride(((Player) Assertions.checkNotNull(PlayerControlView.this.player)).getTrackSelectionParameters()) ? 4 : 0);
            subSettingViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlayerControlView.AudioTrackSelectionAdapter.m3554h(this.f3559b, view);
                }
            });
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public void onTrackSelection(String str) {
            PlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, str);
        }
    }

    public final class ComponentListener implements Player.Listener, TimeBar.OnScrubListener, View.OnClickListener, PopupWindow.OnDismissListener {
        private ComponentListener() {
        }

        @Override // androidx.media3.common.Player.Listener
        public void onEvents(Player player, Player.Events events) {
            if (events.containsAny(4, 5, 13)) {
                PlayerControlView.this.updatePlayPauseButton();
            }
            if (events.containsAny(4, 5, 7, 13)) {
                PlayerControlView.this.updateProgress();
            }
            if (events.containsAny(8, 13)) {
                PlayerControlView.this.updateRepeatModeButton();
            }
            if (events.containsAny(9, 13)) {
                PlayerControlView.this.updateShuffleButton();
            }
            if (events.containsAny(8, 9, 11, 0, 16, 17, 13)) {
                PlayerControlView.this.updateNavigation();
            }
            if (events.containsAny(11, 0, 13)) {
                PlayerControlView.this.updateTimeline();
            }
            if (events.containsAny(12, 13)) {
                PlayerControlView.this.updatePlaybackSpeedList();
            }
            if (events.containsAny(2, 13)) {
                PlayerControlView.this.updateTrackLists();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Player player = PlayerControlView.this.player;
            if (player == null) {
                return;
            }
            PlayerControlView.this.controlViewLayoutManager.resetHideCallbacks();
            if (PlayerControlView.this.nextButton == view) {
                if (player.isCommandAvailable(9)) {
                    player.seekToNext();
                    return;
                }
                return;
            }
            if (PlayerControlView.this.previousButton == view) {
                if (player.isCommandAvailable(7)) {
                    player.seekToPrevious();
                    return;
                }
                return;
            }
            if (PlayerControlView.this.fastForwardButton == view) {
                if (player.getPlaybackState() == 4 || !player.isCommandAvailable(12)) {
                    return;
                }
                player.seekForward();
                return;
            }
            if (PlayerControlView.this.rewindButton == view) {
                if (player.isCommandAvailable(11)) {
                    player.seekBack();
                    return;
                }
                return;
            }
            if (PlayerControlView.this.playPauseButton == view) {
                Util.handlePlayPauseButtonAction(player, PlayerControlView.this.showPlayButtonIfSuppressed);
                return;
            }
            if (PlayerControlView.this.repeatToggleButton == view) {
                if (player.isCommandAvailable(15)) {
                    player.setRepeatMode(RepeatModeUtil.getNextRepeatMode(player.getRepeatMode(), PlayerControlView.this.repeatToggleModes));
                    return;
                }
                return;
            }
            if (PlayerControlView.this.shuffleButton == view) {
                if (player.isCommandAvailable(14)) {
                    player.setShuffleModeEnabled(!player.getShuffleModeEnabled());
                    return;
                }
                return;
            }
            if (PlayerControlView.this.settingsButton == view) {
                PlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                PlayerControlView playerControlView = PlayerControlView.this;
                playerControlView.displaySettingsWindow(playerControlView.settingsAdapter, PlayerControlView.this.settingsButton);
                return;
            }
            if (PlayerControlView.this.playbackSpeedButton == view) {
                PlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                PlayerControlView playerControlView2 = PlayerControlView.this;
                playerControlView2.displaySettingsWindow(playerControlView2.playbackSpeedAdapter, PlayerControlView.this.playbackSpeedButton);
            } else if (PlayerControlView.this.audioTrackButton == view) {
                PlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                PlayerControlView playerControlView3 = PlayerControlView.this;
                playerControlView3.displaySettingsWindow(playerControlView3.audioTrackSelectionAdapter, PlayerControlView.this.audioTrackButton);
            } else if (PlayerControlView.this.subtitleButton == view) {
                PlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                PlayerControlView playerControlView4 = PlayerControlView.this;
                playerControlView4.displaySettingsWindow(playerControlView4.textTrackSelectionAdapter, PlayerControlView.this.subtitleButton);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (PlayerControlView.this.needToHideBars) {
                PlayerControlView.this.controlViewLayoutManager.resetHideCallbacks();
            }
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public void onScrubMove(TimeBar timeBar, long j11) {
            if (PlayerControlView.this.positionView != null) {
                PlayerControlView.this.positionView.setText(Util.getStringForTime(PlayerControlView.this.formatBuilder, PlayerControlView.this.formatter, j11));
            }
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public void onScrubStart(TimeBar timeBar, long j11) {
            PlayerControlView.this.scrubbing = true;
            if (PlayerControlView.this.positionView != null) {
                PlayerControlView.this.positionView.setText(Util.getStringForTime(PlayerControlView.this.formatBuilder, PlayerControlView.this.formatter, j11));
            }
            PlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public void onScrubStop(TimeBar timeBar, long j11, boolean z11) {
            PlayerControlView.this.scrubbing = false;
            if (!z11 && PlayerControlView.this.player != null) {
                PlayerControlView playerControlView = PlayerControlView.this;
                playerControlView.seekToTimeBarPosition(playerControlView.player, j11);
            }
            PlayerControlView.this.controlViewLayoutManager.resetHideCallbacks();
        }
    }

    @Deprecated
    public interface OnFullScreenModeChangedListener {
        void onFullScreenModeChanged(boolean z11);
    }

    public final class PlaybackSpeedAdapter extends RecyclerView.Adapter<SubSettingViewHolder> {
        private final String[] playbackSpeedTexts;
        private final float[] playbackSpeeds;
        private int selectedIndex;

        public void updateSelectedIndex(float f11) {
            int i11 = 0;
            float f12 = Float.MAX_VALUE;
            int i12 = 0;
            while (true) {
                float[] fArr = this.playbackSpeeds;
                if (i11 >= fArr.length) {
                    this.selectedIndex = i12;
                    return;
                }
                float fAbs = Math.abs(f11 - fArr[i11]);
                if (fAbs < f12) {
                    i12 = i11;
                    f12 = fAbs;
                }
                i11++;
            }
        }

        public PlaybackSpeedAdapter(String[] strArr, float[] fArr) {
            this.playbackSpeedTexts = strArr;
            this.playbackSpeeds = fArr;
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ void m3555g(PlaybackSpeedAdapter playbackSpeedAdapter, int i11, View view) {
            if (i11 != playbackSpeedAdapter.selectedIndex) {
                PlayerControlView.this.setPlaybackSpeed(playbackSpeedAdapter.playbackSpeeds[i11]);
            }
            PlayerControlView.this.settingsWindow.dismiss();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.playbackSpeedTexts.length;
        }

        public String getSelectedText() {
            return this.playbackSpeedTexts[this.selectedIndex];
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, final int i11) {
            String[] strArr = this.playbackSpeedTexts;
            if (i11 < strArr.length) {
                subSettingViewHolder.textView.setText(strArr[i11]);
            }
            if (i11 == this.selectedIndex) {
                subSettingViewHolder.itemView.setSelected(true);
                subSettingViewHolder.checkView.setVisibility(0);
            } else {
                subSettingViewHolder.itemView.setSelected(false);
                subSettingViewHolder.checkView.setVisibility(4);
            }
            subSettingViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlayerControlView.PlaybackSpeedAdapter.m3555g(this.f3560b, i11, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public SubSettingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i11) {
            return new SubSettingViewHolder(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(C3627R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    public interface ProgressUpdateListener {
        void onProgressUpdate(long j11, long j12);
    }

    public final class SettingViewHolder extends RecyclerView.ViewHolder {
        private final ImageView iconView;
        private final TextView mainTextView;
        private final TextView subTextView;

        public SettingViewHolder(View view) {
            super(view);
            if (Util.SDK_INT < 26) {
                view.setFocusable(true);
            }
            this.mainTextView = (TextView) view.findViewById(C3627R.id.exo_main_text);
            this.subTextView = (TextView) view.findViewById(C3627R.id.exo_sub_text);
            this.iconView = (ImageView) view.findViewById(C3627R.id.exo_icon);
            view.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    PlayerControlView.SettingViewHolder settingViewHolder = this.f3562b;
                    PlayerControlView.this.onSettingViewClicked(settingViewHolder.getBindingAdapterPosition());
                }
            });
        }
    }

    public class SettingsAdapter extends RecyclerView.Adapter<SettingViewHolder> {
        private final Drawable[] iconIds;
        private final String[] mainTexts;
        private final String[] subTexts;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i11) {
            return i11;
        }

        public boolean hasSettingsToShow() {
            return shouldShowSetting(1) || shouldShowSetting(0);
        }

        public SettingsAdapter(String[] strArr, Drawable[] drawableArr) {
            this.mainTexts = strArr;
            this.subTexts = new String[strArr.length];
            this.iconIds = drawableArr;
        }

        private boolean shouldShowSetting(int i11) {
            if (PlayerControlView.this.player == null) {
                return false;
            }
            if (i11 == 0) {
                return PlayerControlView.this.player.isCommandAvailable(13);
            }
            if (i11 != 1) {
                return true;
            }
            return PlayerControlView.this.player.isCommandAvailable(30) && PlayerControlView.this.player.isCommandAvailable(29);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.mainTexts.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(SettingViewHolder settingViewHolder, int i11) {
            if (shouldShowSetting(i11)) {
                settingViewHolder.itemView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            } else {
                settingViewHolder.itemView.setLayoutParams(new RecyclerView.LayoutParams(0, 0));
            }
            settingViewHolder.mainTextView.setText(this.mainTexts[i11]);
            if (this.subTexts[i11] == null) {
                settingViewHolder.subTextView.setVisibility(8);
            } else {
                settingViewHolder.subTextView.setText(this.subTexts[i11]);
            }
            if (this.iconIds[i11] == null) {
                settingViewHolder.iconView.setVisibility(8);
            } else {
                settingViewHolder.iconView.setImageDrawable(this.iconIds[i11]);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public SettingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i11) {
            return PlayerControlView.this.new SettingViewHolder(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(C3627R.layout.exo_styled_settings_list_item, viewGroup, false));
        }

        public void setSubTextAtPosition(int i11, String str) {
            this.subTexts[i11] = str;
        }
    }

    public final class TextTrackSelectionAdapter extends TrackSelectionAdapter {
        private TextTrackSelectionAdapter() {
            super();
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public void init(List<TrackInformation> list) {
            boolean z11 = false;
            for (int i11 = 0; i11 < list.size(); i11++) {
                if (list.get(i11).isSelected()) {
                    z11 = true;
                    break;
                }
            }
            if (PlayerControlView.this.subtitleButton != null) {
                ImageView imageView = PlayerControlView.this.subtitleButton;
                PlayerControlView playerControlView = PlayerControlView.this;
                imageView.setImageDrawable(z11 ? playerControlView.subtitleOnButtonDrawable : playerControlView.subtitleOffButtonDrawable);
                PlayerControlView.this.subtitleButton.setContentDescription(z11 ? PlayerControlView.this.subtitleOnContentDescription : PlayerControlView.this.subtitleOffContentDescription);
            }
            this.tracks = list;
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ void m3557h(TextTrackSelectionAdapter textTrackSelectionAdapter, View view) {
            if (PlayerControlView.this.player == null || !PlayerControlView.this.player.isCommandAvailable(29)) {
                return;
            }
            PlayerControlView.this.player.setTrackSelectionParameters(PlayerControlView.this.player.getTrackSelectionParameters().buildUpon().clearOverridesOfType(3).setIgnoredTextSelectionFlags(-3).setPreferredTextLanguage(null).setPreferredTextRoleFlags(0).build());
            PlayerControlView.this.settingsWindow.dismiss();
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, int i11) {
            super.onBindViewHolder(subSettingViewHolder, i11);
            if (i11 > 0) {
                subSettingViewHolder.checkView.setVisibility(this.tracks.get(i11 + (-1)).isSelected() ? 0 : 4);
            }
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public void onBindViewHolderAtZeroPosition(SubSettingViewHolder subSettingViewHolder) {
            boolean z11;
            subSettingViewHolder.textView.setText(C3627R.string.exo_track_selection_none);
            int i11 = 0;
            while (true) {
                if (i11 >= this.tracks.size()) {
                    z11 = true;
                    break;
                } else {
                    if (this.tracks.get(i11).isSelected()) {
                        z11 = false;
                        break;
                    }
                    i11++;
                }
            }
            subSettingViewHolder.checkView.setVisibility(z11 ? 0 : 4);
            subSettingViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlayerControlView.TextTrackSelectionAdapter.m3557h(this.f3563b, view);
                }
            });
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public void onTrackSelection(String str) {
        }
    }

    public static final class TrackInformation {
        public final Tracks.Group trackGroup;
        public final int trackIndex;
        public final String trackName;

        public boolean isSelected() {
            return this.trackGroup.isTrackSelected(this.trackIndex);
        }

        public TrackInformation(Tracks tracks, int i11, int i12, String str) {
            this.trackGroup = tracks.getGroups().get(i11);
            this.trackIndex = i12;
            this.trackName = str;
        }
    }

    public abstract class TrackSelectionAdapter extends RecyclerView.Adapter<SubSettingViewHolder> {
        protected List<TrackInformation> tracks = new ArrayList();

        public abstract void init(List<TrackInformation> list);

        public abstract void onBindViewHolderAtZeroPosition(SubSettingViewHolder subSettingViewHolder);

        public abstract void onTrackSelection(String str);

        public TrackSelectionAdapter() {
        }

        public void clear() {
            this.tracks = Collections.EMPTY_LIST;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            if (this.tracks.isEmpty()) {
                return 0;
            }
            return this.tracks.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, int i11) {
            final Player player = PlayerControlView.this.player;
            if (player == null) {
                return;
            }
            if (i11 == 0) {
                onBindViewHolderAtZeroPosition(subSettingViewHolder);
                return;
            }
            final TrackInformation trackInformation = this.tracks.get(i11 - 1);
            final TrackGroup mediaTrackGroup = trackInformation.trackGroup.getMediaTrackGroup();
            boolean z11 = player.getTrackSelectionParameters().overrides.get(mediaTrackGroup) != null && trackInformation.isSelected();
            subSettingViewHolder.textView.setText(trackInformation.trackName);
            subSettingViewHolder.checkView.setVisibility(z11 ? 0 : 4);
            subSettingViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlayerControlView.TrackSelectionAdapter.m3558g(this.f3564b, player, mediaTrackGroup, trackInformation, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public SubSettingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i11) {
            return new SubSettingViewHolder(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(C3627R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ void m3558g(TrackSelectionAdapter trackSelectionAdapter, Player player, TrackGroup trackGroup, TrackInformation trackInformation, View view) {
            trackSelectionAdapter.getClass();
            if (!player.isCommandAvailable(29)) {
                return;
            }
            player.setTrackSelectionParameters(player.getTrackSelectionParameters().buildUpon().setOverrideForType(new TrackSelectionOverride(trackGroup, ImmutableList.m13440of(Integer.valueOf(trackInformation.trackIndex)))).setTrackTypeDisabled(trackInformation.trackGroup.getType(), false).build());
            trackSelectionAdapter.onTrackSelection(trackInformation.trackName);
            PlayerControlView.this.settingsWindow.dismiss();
        }
    }

    @Deprecated
    public interface VisibilityListener {
        void onVisibilityChange(int i11);
    }

    public PlayerControlView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int i19 = i14 - i12;
        int i21 = i18 - i16;
        if (!(i13 - i11 == i17 - i15 && i19 == i21) && this.settingsWindow.isShowing()) {
            updateSettingsWindowSize();
            this.settingsWindow.update(view, (getWidth() - this.settingsWindow.getWidth()) - this.settingsWindowMargin, (-this.settingsWindow.getHeight()) - this.settingsWindowMargin, -1, -1);
        }
    }

    public int getRepeatToggleModes() {
        return this.repeatToggleModes;
    }

    public void setExtraAdGroupMarkers(@Nullable long[] jArr, @Nullable boolean[] zArr) {
        if (jArr == null) {
            this.extraAdGroupTimesMs = new long[0];
            this.extraPlayedAdGroups = new boolean[0];
        } else {
            boolean[] zArr2 = (boolean[]) Assertions.checkNotNull(zArr);
            Assertions.checkArgument(jArr.length == zArr2.length);
            this.extraAdGroupTimesMs = jArr;
            this.extraPlayedAdGroups = zArr2;
        }
        updateTimeline();
    }

    public static class SubSettingViewHolder extends RecyclerView.ViewHolder {
        public final View checkView;
        public final TextView textView;

        public SubSettingViewHolder(View view) {
            super(view);
            if (Util.SDK_INT < 26) {
                view.setFocusable(true);
            }
            this.textView = (TextView) view.findViewById(C3627R.id.exo_text);
            this.checkView = view.findViewById(C3627R.id.exo_check);
        }
    }

    static {
        MediaLibraryInfo.registerModule("media3.ui");
        PLAYBACK_SPEEDS = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public PlayerControlView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static boolean canShowMultiWindowTimeBar(Player player, Timeline.Window window) {
        Timeline currentTimeline;
        int windowCount;
        if (!player.isCommandAvailable(17) || (windowCount = (currentTimeline = player.getCurrentTimeline()).getWindowCount()) <= 1 || windowCount > 100) {
            return false;
        }
        for (int i11 = 0; i11 < windowCount; i11++) {
            if (currentTimeline.getWindow(i11, window).durationUs == C2711C.TIME_UNSET) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void displaySettingsWindow(RecyclerView.Adapter<?> adapter, View view) {
        this.settingsView.setAdapter(adapter);
        updateSettingsWindowSize();
        this.needToHideBars = false;
        this.settingsWindow.dismiss();
        this.needToHideBars = true;
        this.settingsWindow.showAsDropDown(view, (getWidth() - this.settingsWindow.getWidth()) - this.settingsWindowMargin, (-this.settingsWindow.getHeight()) - this.settingsWindowMargin);
    }

    private ImmutableList<TrackInformation> gatherSupportedTrackInfosOfType(Tracks tracks, int i11) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        ImmutableList<Tracks.Group> groups = tracks.getGroups();
        for (int i12 = 0; i12 < groups.size(); i12++) {
            Tracks.Group group = groups.get(i12);
            if (group.getType() == i11) {
                for (int i13 = 0; i13 < group.length; i13++) {
                    if (group.isTrackSupported(i13)) {
                        Format trackFormat = group.getTrackFormat(i13);
                        if ((trackFormat.selectionFlags & 2) == 0) {
                            builder.add(new TrackInformation(tracks, i12, i13, this.trackNameProvider.getTrackName(trackFormat)));
                        }
                    }
                }
            }
        }
        return builder.build();
    }

    private static int getRepeatToggleModes(TypedArray typedArray, int i11) {
        return typedArray.getInt(C3627R.styleable.PlayerControlView_repeat_toggle_modes, i11);
    }

    private void initTrackSelectionAdapter() {
        this.textTrackSelectionAdapter.clear();
        this.audioTrackSelectionAdapter.clear();
        Player player = this.player;
        if (player != null && player.isCommandAvailable(30) && this.player.isCommandAvailable(29)) {
            Tracks currentTracks = this.player.getCurrentTracks();
            this.audioTrackSelectionAdapter.init(gatherSupportedTrackInfosOfType(currentTracks, 1));
            if (this.controlViewLayoutManager.getShowButton(this.subtitleButton)) {
                this.textTrackSelectionAdapter.init(gatherSupportedTrackInfosOfType(currentTracks, 3));
            } else {
                this.textTrackSelectionAdapter.init(ImmutableList.m13439of());
            }
        }
    }

    private static void initializeFullscreenButton(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    @SuppressLint({"InlinedApi"})
    private static boolean isHandledMediaKey(int i11) {
        return i11 == 90 || i11 == 89 || i11 == 85 || i11 == 79 || i11 == 126 || i11 == 127 || i11 == 87 || i11 == 88;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFullscreenButtonClicked(View view) {
        updateIsFullscreen(!this.isFullscreen);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSettingViewClicked(int i11) {
        if (i11 == 0) {
            displaySettingsWindow(this.playbackSpeedAdapter, (View) Assertions.checkNotNull(this.settingsButton));
        } else if (i11 == 1) {
            displaySettingsWindow(this.audioTrackSelectionAdapter, (View) Assertions.checkNotNull(this.settingsButton));
        } else {
            this.settingsWindow.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void seekToTimeBarPosition(Player player, long j11) {
        if (this.multiWindowTimeBar) {
            if (player.isCommandAvailable(17) && player.isCommandAvailable(10)) {
                Timeline currentTimeline = player.getCurrentTimeline();
                int windowCount = currentTimeline.getWindowCount();
                int i11 = 0;
                while (true) {
                    long durationMs = currentTimeline.getWindow(i11, this.window).getDurationMs();
                    if (j11 < durationMs) {
                        break;
                    }
                    if (i11 == windowCount - 1) {
                        j11 = durationMs;
                        break;
                    } else {
                        j11 -= durationMs;
                        i11++;
                    }
                }
                player.seekTo(i11, j11);
            }
        } else if (player.isCommandAvailable(5)) {
            player.seekTo(j11);
        }
        updateProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f11) {
        Player player = this.player;
        if (player == null || !player.isCommandAvailable(13)) {
            return;
        }
        Player player2 = this.player;
        player2.setPlaybackParameters(player2.getPlaybackParameters().withSpeed(f11));
    }

    private boolean shouldEnablePlayPauseButton() {
        Player player = this.player;
        if (player == null || !player.isCommandAvailable(1)) {
            return false;
        }
        return (this.player.isCommandAvailable(17) && this.player.getCurrentTimeline().isEmpty()) ? false : true;
    }

    private void updateButton(boolean z11, @Nullable View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z11);
        view.setAlpha(z11 ? this.buttonAlphaEnabled : this.buttonAlphaDisabled);
    }

    private void updateFastForwardButton() {
        Player player = this.player;
        int seekForwardIncrement = (int) ((player != null ? player.getSeekForwardIncrement() : C2711C.DEFAULT_SEEK_FORWARD_INCREMENT_MS) / 1000);
        TextView textView = this.fastForwardButtonTextView;
        if (textView != null) {
            textView.setText(String.valueOf(seekForwardIncrement));
        }
        View view = this.fastForwardButton;
        if (view != null) {
            view.setContentDescription(this.resources.getQuantityString(C3627R.plurals.exo_controls_fastforward_by_amount_description, seekForwardIncrement, Integer.valueOf(seekForwardIncrement)));
        }
    }

    private void updateFullscreenButtonForState(@Nullable ImageView imageView, boolean z11) {
        if (imageView == null) {
            return;
        }
        if (z11) {
            imageView.setImageDrawable(this.fullscreenExitDrawable);
            imageView.setContentDescription(this.fullscreenExitContentDescription);
        } else {
            imageView.setImageDrawable(this.fullscreenEnterDrawable);
            imageView.setContentDescription(this.fullscreenEnterContentDescription);
        }
    }

    private static void updateFullscreenButtonVisibility(@Nullable View view, boolean z11) {
        if (view == null) {
            return;
        }
        if (z11) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlaybackSpeedList() {
        Player player = this.player;
        if (player == null) {
            return;
        }
        this.playbackSpeedAdapter.updateSelectedIndex(player.getPlaybackParameters().speed);
        this.settingsAdapter.setSubTextAtPosition(0, this.playbackSpeedAdapter.getSelectedText());
        updateSettingsButton();
    }

    private void updateRewindButton() {
        Player player = this.player;
        int seekBackIncrement = (int) ((player != null ? player.getSeekBackIncrement() : 5000L) / 1000);
        TextView textView = this.rewindButtonTextView;
        if (textView != null) {
            textView.setText(String.valueOf(seekBackIncrement));
        }
        View view = this.rewindButton;
        if (view != null) {
            view.setContentDescription(this.resources.getQuantityString(C3627R.plurals.exo_controls_rewind_by_amount_description, seekBackIncrement, Integer.valueOf(seekBackIncrement)));
        }
    }

    private void updateSettingsButton() {
        updateButton(this.settingsAdapter.hasSettingsToShow(), this.settingsButton);
    }

    private void updateSettingsWindowSize() {
        this.settingsView.measure(0, 0);
        this.settingsWindow.setWidth(Math.min(this.settingsView.getMeasuredWidth(), getWidth() - (this.settingsWindowMargin * 2)));
        this.settingsWindow.setHeight(Math.min(getHeight() - (this.settingsWindowMargin * 2), this.settingsView.getMeasuredHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:62:0x0116  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v6, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    public void updateTimeline() {
        int i11;
        long jMsToUs;
        Timeline.Window window;
        long j11;
        Player player = this.player;
        if (player == null) {
            return;
        }
        boolean z11 = true;
        this.multiWindowTimeBar = this.showMultiWindowTimeBar && canShowMultiWindowTimeBar(player, this.window);
        long j12 = 0;
        this.currentWindowOffset = 0L;
        Timeline currentTimeline = player.isCommandAvailable(17) ? player.getCurrentTimeline() : Timeline.EMPTY;
        boolean zIsEmpty = currentTimeline.isEmpty();
        long j13 = C2711C.TIME_UNSET;
        if (!zIsEmpty) {
            int currentMediaItemIndex = player.getCurrentMediaItemIndex();
            boolean z12 = this.multiWindowTimeBar;
            int i12 = z12 ? 0 : currentMediaItemIndex;
            int windowCount = z12 ? currentTimeline.getWindowCount() - 1 : currentMediaItemIndex;
            i11 = 0;
            long j14 = 0;
            while (i12 <= windowCount) {
                if (i12 == currentMediaItemIndex) {
                    this.currentWindowOffset = Util.usToMs(j14);
                }
                currentTimeline.getWindow(i12, this.window);
                Timeline.Window window2 = this.window;
                boolean z13 = z11;
                long j15 = j12;
                if (window2.durationUs == j13) {
                    Assertions.checkState(this.multiWindowTimeBar ^ z13);
                    break;
                }
                int i13 = window2.firstPeriodIndex;
                while (true) {
                    window = this.window;
                    if (i13 <= window.lastPeriodIndex) {
                        currentTimeline.getPeriod(i13, this.period);
                        int removedAdGroupCount = this.period.getRemovedAdGroupCount();
                        int adGroupCount = this.period.getAdGroupCount();
                        while (removedAdGroupCount < adGroupCount) {
                            long adGroupTimeUs = this.period.getAdGroupTimeUs(removedAdGroupCount);
                            if (adGroupTimeUs == Long.MIN_VALUE) {
                                j11 = j13;
                                long j16 = this.period.durationUs;
                                if (j16 != j11) {
                                    adGroupTimeUs = j16;
                                }
                                removedAdGroupCount++;
                                j13 = j11;
                            } else {
                                j11 = j13;
                            }
                            long positionInWindowUs = adGroupTimeUs + this.period.getPositionInWindowUs();
                            if (positionInWindowUs >= j15) {
                                long[] jArr = this.adGroupTimesMs;
                                if (i11 == jArr.length) {
                                    ?? length = jArr.length == 0 ? z13 : jArr.length * 2;
                                    this.adGroupTimesMs = Arrays.copyOf(jArr, (int) length);
                                    this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, (int) length);
                                }
                                this.adGroupTimesMs[i11] = Util.usToMs(j14 + positionInWindowUs);
                                this.playedAdGroups[i11] = this.period.hasPlayedAdGroup(removedAdGroupCount);
                                i11++;
                            }
                            removedAdGroupCount++;
                            j13 = j11;
                        }
                        i13++;
                    }
                }
                j14 += window.durationUs;
                i12++;
                z11 = z13;
                j12 = j15;
            }
            jMsToUs = j14;
        } else if (player.isCommandAvailable(16)) {
            long contentDuration = player.getContentDuration();
            if (contentDuration != C2711C.TIME_UNSET) {
                jMsToUs = Util.msToUs(contentDuration);
                i11 = 0;
            } else {
                i11 = 0;
                jMsToUs = 0;
            }
        } else {
            i11 = 0;
            jMsToUs = 0;
        }
        long jUsToMs = Util.usToMs(jMsToUs);
        TextView textView = this.durationView;
        if (textView != null) {
            textView.setText(Util.getStringForTime(this.formatBuilder, this.formatter, jUsToMs));
        }
        TimeBar timeBar = this.timeBar;
        if (timeBar != null) {
            timeBar.setDuration(jUsToMs);
            int length2 = this.extraAdGroupTimesMs.length;
            int i14 = i11 + length2;
            long[] jArr2 = this.adGroupTimesMs;
            if (i14 > jArr2.length) {
                this.adGroupTimesMs = Arrays.copyOf(jArr2, i14);
                this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, i14);
            }
            System.arraycopy(this.extraAdGroupTimesMs, 0, this.adGroupTimesMs, i11, length2);
            System.arraycopy(this.extraPlayedAdGroups, 0, this.playedAdGroups, i11, length2);
            this.timeBar.setAdGroupTimesMs(this.adGroupTimesMs, this.playedAdGroups, i14);
        }
        updateProgress();
    }

    @Nullable
    public Player getPlayer() {
        return this.player;
    }

    public boolean getShowShuffleButton() {
        return this.controlViewLayoutManager.getShowButton(this.shuffleButton);
    }

    public boolean getShowSubtitleButton() {
        return this.controlViewLayoutManager.getShowButton(this.subtitleButton);
    }

    public int getShowTimeoutMs() {
        return this.showTimeoutMs;
    }

    public boolean getShowVrButton() {
        return this.controlViewLayoutManager.getShowButton(this.vrButton);
    }

    public void hide() {
        this.controlViewLayoutManager.hide();
    }

    public void hideImmediately() {
        this.controlViewLayoutManager.hideImmediately();
    }

    public boolean isAnimationEnabled() {
        return this.controlViewLayoutManager.isAnimationEnabled();
    }

    public boolean isFullyVisible() {
        return this.controlViewLayoutManager.isFullyVisible();
    }

    public void notifyOnVisibilityChange() {
        Iterator<VisibilityListener> it = this.visibilityListeners.iterator();
        while (it.hasNext()) {
            it.next().onVisibilityChange(getVisibility());
        }
    }

    @Deprecated
    public void removeVisibilityListener(VisibilityListener visibilityListener) {
        this.visibilityListeners.remove(visibilityListener);
    }

    public void requestPlayPauseFocus() {
        ImageView imageView = this.playPauseButton;
        if (imageView != null) {
            imageView.requestFocus();
        }
    }

    public void setAnimationEnabled(boolean z11) {
        this.controlViewLayoutManager.setAnimationEnabled(z11);
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(@Nullable OnFullScreenModeChangedListener onFullScreenModeChangedListener) {
        this.onFullScreenModeChangedListener = onFullScreenModeChangedListener;
        updateFullscreenButtonVisibility(this.fullscreenButton, onFullScreenModeChangedListener != null);
        updateFullscreenButtonVisibility(this.minimalFullscreenButton, onFullScreenModeChangedListener != null);
    }

    public void setProgressUpdateListener(@Nullable ProgressUpdateListener progressUpdateListener) {
        this.progressUpdateListener = progressUpdateListener;
    }

    public void setRepeatToggleModes(int i11) {
        this.repeatToggleModes = i11;
        Player player = this.player;
        if (player != null && player.isCommandAvailable(15)) {
            int repeatMode = this.player.getRepeatMode();
            if (i11 == 0 && repeatMode != 0) {
                this.player.setRepeatMode(0);
            } else if (i11 == 1 && repeatMode == 2) {
                this.player.setRepeatMode(1);
            } else if (i11 == 2 && repeatMode == 1) {
                this.player.setRepeatMode(2);
            }
        }
        this.controlViewLayoutManager.setShowButton(this.repeatToggleButton, i11 != 0);
        updateRepeatModeButton();
    }

    public void setShowFastForwardButton(boolean z11) {
        this.controlViewLayoutManager.setShowButton(this.fastForwardButton, z11);
        updateNavigation();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z11) {
        this.showMultiWindowTimeBar = z11;
        updateTimeline();
    }

    public void setShowNextButton(boolean z11) {
        this.controlViewLayoutManager.setShowButton(this.nextButton, z11);
        updateNavigation();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z11) {
        this.showPlayButtonIfSuppressed = z11;
        updatePlayPauseButton();
    }

    public void setShowPreviousButton(boolean z11) {
        this.controlViewLayoutManager.setShowButton(this.previousButton, z11);
        updateNavigation();
    }

    public void setShowRewindButton(boolean z11) {
        this.controlViewLayoutManager.setShowButton(this.rewindButton, z11);
        updateNavigation();
    }

    public void setShowShuffleButton(boolean z11) {
        this.controlViewLayoutManager.setShowButton(this.shuffleButton, z11);
        updateShuffleButton();
    }

    public void setShowSubtitleButton(boolean z11) {
        this.controlViewLayoutManager.setShowButton(this.subtitleButton, z11);
    }

    public void setShowTimeoutMs(int i11) {
        this.showTimeoutMs = i11;
        if (isFullyVisible()) {
            this.controlViewLayoutManager.resetHideCallbacks();
        }
    }

    public void setShowVrButton(boolean z11) {
        this.controlViewLayoutManager.setShowButton(this.vrButton, z11);
    }

    public void setTimeBarMinUpdateInterval(int i11) {
        this.timeBarMinUpdateIntervalMs = Util.constrainValue(i11, 16, 1000);
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        ImageView imageView = this.vrButton;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            updateButton(onClickListener != null, this.vrButton);
        }
    }

    public void show() {
        this.controlViewLayoutManager.show();
    }

    public void updateIsFullscreen(boolean z11) {
        if (this.isFullscreen == z11) {
            return;
        }
        this.isFullscreen = z11;
        updateFullscreenButtonForState(this.fullscreenButton, z11);
        updateFullscreenButtonForState(this.minimalFullscreenButton, z11);
        OnFullScreenModeChangedListener onFullScreenModeChangedListener = this.onFullScreenModeChangedListener;
        if (onFullScreenModeChangedListener != null) {
            onFullScreenModeChangedListener.onFullScreenModeChanged(z11);
        }
    }

    public PlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateNavigation() {
        boolean zIsCommandAvailable;
        boolean zIsCommandAvailable2;
        boolean zIsCommandAvailable3;
        boolean zIsCommandAvailable4;
        boolean zIsCommandAvailable5;
        if (isVisible() && this.isAttachedToWindow) {
            Player player = this.player;
            if (player != null) {
                if (this.showMultiWindowTimeBar && canShowMultiWindowTimeBar(player, this.window)) {
                    zIsCommandAvailable = player.isCommandAvailable(10);
                } else {
                    zIsCommandAvailable = player.isCommandAvailable(5);
                }
                zIsCommandAvailable3 = player.isCommandAvailable(7);
                zIsCommandAvailable4 = player.isCommandAvailable(11);
                zIsCommandAvailable5 = player.isCommandAvailable(12);
                zIsCommandAvailable2 = player.isCommandAvailable(9);
            } else {
                zIsCommandAvailable = false;
                zIsCommandAvailable2 = false;
                zIsCommandAvailable3 = false;
                zIsCommandAvailable4 = false;
                zIsCommandAvailable5 = false;
            }
            if (zIsCommandAvailable4) {
                updateRewindButton();
            }
            if (zIsCommandAvailable5) {
                updateFastForwardButton();
            }
            updateButton(zIsCommandAvailable3, this.previousButton);
            updateButton(zIsCommandAvailable4, this.rewindButton);
            updateButton(zIsCommandAvailable5, this.fastForwardButton);
            updateButton(zIsCommandAvailable2, this.nextButton);
            TimeBar timeBar = this.timeBar;
            if (timeBar != null) {
                timeBar.setEnabled(zIsCommandAvailable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlayPauseButton() {
        Drawable drawable;
        int i11;
        if (isVisible() && this.isAttachedToWindow && this.playPauseButton != null) {
            boolean zShouldShowPlayButton = Util.shouldShowPlayButton(this.player, this.showPlayButtonIfSuppressed);
            if (zShouldShowPlayButton) {
                drawable = this.playButtonDrawable;
            } else {
                drawable = this.pauseButtonDrawable;
            }
            if (zShouldShowPlayButton) {
                i11 = C3627R.string.exo_controls_play_description;
            } else {
                i11 = C3627R.string.exo_controls_pause_description;
            }
            this.playPauseButton.setImageDrawable(drawable);
            this.playPauseButton.setContentDescription(this.resources.getString(i11));
            updateButton(shouldEnablePlayPauseButton(), this.playPauseButton);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateProgress() {
        long contentPosition;
        long contentBufferedPosition;
        int playbackState;
        long preferredUpdateDelay;
        if (isVisible() && this.isAttachedToWindow) {
            Player player = this.player;
            if (player != null && player.isCommandAvailable(16)) {
                contentPosition = this.currentWindowOffset + player.getContentPosition();
                contentBufferedPosition = this.currentWindowOffset + player.getContentBufferedPosition();
            } else {
                contentPosition = 0;
                contentBufferedPosition = 0;
            }
            TextView textView = this.positionView;
            if (textView != null && !this.scrubbing) {
                textView.setText(Util.getStringForTime(this.formatBuilder, this.formatter, contentPosition));
            }
            TimeBar timeBar = this.timeBar;
            if (timeBar != null) {
                timeBar.setPosition(contentPosition);
                this.timeBar.setBufferedPosition(contentBufferedPosition);
            }
            ProgressUpdateListener progressUpdateListener = this.progressUpdateListener;
            if (progressUpdateListener != null) {
                progressUpdateListener.onProgressUpdate(contentPosition, contentBufferedPosition);
            }
            removeCallbacks(this.updateProgressAction);
            if (player == null) {
                playbackState = 1;
            } else {
                playbackState = player.getPlaybackState();
            }
            long j11 = 1000;
            if (player != null && player.isPlaying()) {
                TimeBar timeBar2 = this.timeBar;
                if (timeBar2 != null) {
                    preferredUpdateDelay = timeBar2.getPreferredUpdateDelay();
                } else {
                    preferredUpdateDelay = 1000;
                }
                long jMin = Math.min(preferredUpdateDelay, 1000 - (contentPosition % 1000));
                float f11 = player.getPlaybackParameters().speed;
                if (f11 > 0.0f) {
                    j11 = (long) (jMin / f11);
                }
                postDelayed(this.updateProgressAction, Util.constrainValue(j11, this.timeBarMinUpdateIntervalMs, 1000L));
                return;
            }
            if (playbackState != 4 && playbackState != 1) {
                postDelayed(this.updateProgressAction, 1000L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateRepeatModeButton() {
        ImageView imageView;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.repeatToggleButton) != null) {
            if (this.repeatToggleModes == 0) {
                updateButton(false, imageView);
                return;
            }
            Player player = this.player;
            if (player != null && player.isCommandAvailable(15)) {
                updateButton(true, this.repeatToggleButton);
                int repeatMode = player.getRepeatMode();
                if (repeatMode != 0) {
                    if (repeatMode != 1) {
                        if (repeatMode == 2) {
                            this.repeatToggleButton.setImageDrawable(this.repeatAllButtonDrawable);
                            this.repeatToggleButton.setContentDescription(this.repeatAllButtonContentDescription);
                            return;
                        }
                        return;
                    }
                    this.repeatToggleButton.setImageDrawable(this.repeatOneButtonDrawable);
                    this.repeatToggleButton.setContentDescription(this.repeatOneButtonContentDescription);
                    return;
                }
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
                return;
            }
            updateButton(false, this.repeatToggleButton);
            this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
            this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateShuffleButton() {
        ImageView imageView;
        Drawable drawable;
        String str;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.shuffleButton) != null) {
            Player player = this.player;
            if (!this.controlViewLayoutManager.getShowButton(imageView)) {
                updateButton(false, this.shuffleButton);
                return;
            }
            if (player != null && player.isCommandAvailable(14)) {
                updateButton(true, this.shuffleButton);
                ImageView imageView2 = this.shuffleButton;
                if (player.getShuffleModeEnabled()) {
                    drawable = this.shuffleOnButtonDrawable;
                } else {
                    drawable = this.shuffleOffButtonDrawable;
                }
                imageView2.setImageDrawable(drawable);
                ImageView imageView3 = this.shuffleButton;
                if (player.getShuffleModeEnabled()) {
                    str = this.shuffleOnContentDescription;
                } else {
                    str = this.shuffleOffContentDescription;
                }
                imageView3.setContentDescription(str);
                return;
            }
            updateButton(false, this.shuffleButton);
            this.shuffleButton.setImageDrawable(this.shuffleOffButtonDrawable);
            this.shuffleButton.setContentDescription(this.shuffleOffContentDescription);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTrackLists() {
        boolean z11;
        initTrackSelectionAdapter();
        if (this.textTrackSelectionAdapter.getItemCount() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        updateButton(z11, this.subtitleButton);
        updateSettingsButton();
    }

    @Deprecated
    public void addVisibilityListener(VisibilityListener visibilityListener) {
        Assertions.checkNotNull(visibilityListener);
        this.visibilityListeners.add(visibilityListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!dispatchMediaKeyEvent(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public boolean dispatchMediaKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        Player player = this.player;
        if (player != null && isHandledMediaKey(keyCode)) {
            if (keyEvent.getAction() == 0) {
                if (keyCode == 90) {
                    if (player.getPlaybackState() != 4 && player.isCommandAvailable(12)) {
                        player.seekForward();
                        return true;
                    }
                    return true;
                }
                if (keyCode == 89 && player.isCommandAvailable(11)) {
                    player.seekBack();
                    return true;
                }
                if (keyEvent.getRepeatCount() == 0) {
                    if (keyCode != 79 && keyCode != 85) {
                        if (keyCode != 87) {
                            if (keyCode != 88) {
                                if (keyCode != 126) {
                                    if (keyCode == 127) {
                                        Util.handlePauseButtonAction(player);
                                        return true;
                                    }
                                    return true;
                                }
                                Util.handlePlayButtonAction(player);
                                return true;
                            }
                            if (player.isCommandAvailable(7)) {
                                player.seekToPrevious();
                                return true;
                            }
                            return true;
                        }
                        if (player.isCommandAvailable(9)) {
                            player.seekToNext();
                            return true;
                        }
                        return true;
                    }
                    Util.handlePlayPauseButtonAction(player, this.showPlayButtonIfSuppressed);
                    return true;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public boolean isVisible() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.controlViewLayoutManager.onAttachedToWindow();
        this.isAttachedToWindow = true;
        if (isFullyVisible()) {
            this.controlViewLayoutManager.resetHideCallbacks();
        }
        updateAll();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.controlViewLayoutManager.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        removeCallbacks(this.updateProgressAction);
        this.controlViewLayoutManager.removeHideCallbacks();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        this.controlViewLayoutManager.onLayout(z11, i11, i12, i13, i14);
    }

    public void setPlayer(@Nullable Player player) {
        boolean z11;
        boolean z12 = false;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z11 = true;
        } else {
            z11 = false;
        }
        Assertions.checkState(z11);
        if (player == null || player.getApplicationLooper() == Looper.getMainLooper()) {
            z12 = true;
        }
        Assertions.checkArgument(z12);
        Player player2 = this.player;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.removeListener(this.componentListener);
        }
        this.player = player;
        if (player != null) {
            player.addListener(this.componentListener);
        }
        updateAll();
    }

    public void updateAll() {
        updatePlayPauseButton();
        updateNavigation();
        updateRepeatModeButton();
        updateShuffleButton();
        updateTrackLists();
        updatePlaybackSpeedList();
        updateTimeline();
    }

    public PlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i11, @Nullable AttributeSet attributeSet2) throws Throwable {
        int i12;
        final PlayerControlView playerControlView;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z17;
        int i28;
        int i29;
        boolean z18;
        Context context2;
        int i31;
        final PlayerControlView playerControlView2;
        boolean z19;
        super(context, attributeSet, i11);
        int i32 = C3627R.layout.exo_player_control_view;
        int i33 = C3627R.drawable.exo_styled_controls_play;
        int i34 = C3627R.drawable.exo_styled_controls_pause;
        int i35 = C3627R.drawable.exo_styled_controls_next;
        int i36 = C3627R.drawable.exo_styled_controls_simple_fastforward;
        int i37 = C3627R.drawable.exo_styled_controls_previous;
        int i38 = C3627R.drawable.exo_styled_controls_simple_rewind;
        int i39 = C3627R.drawable.exo_styled_controls_fullscreen_exit;
        int i41 = C3627R.drawable.exo_styled_controls_fullscreen_enter;
        int i42 = C3627R.drawable.exo_styled_controls_repeat_off;
        int i43 = C3627R.drawable.exo_styled_controls_repeat_one;
        int i44 = C3627R.drawable.exo_styled_controls_repeat_all;
        int i45 = C3627R.drawable.exo_styled_controls_shuffle_on;
        int i46 = C3627R.drawable.exo_styled_controls_shuffle_off;
        int i47 = C3627R.drawable.exo_styled_controls_subtitle_on;
        int i48 = C3627R.drawable.exo_styled_controls_subtitle_off;
        int i49 = C3627R.drawable.exo_styled_controls_vr;
        this.showPlayButtonIfSuppressed = true;
        this.showTimeoutMs = 5000;
        this.repeatToggleModes = 0;
        this.timeBarMinUpdateIntervalMs = 200;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C3627R.styleable.PlayerControlView, i11, 0);
            try {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(C3627R.styleable.PlayerControlView_controller_layout_id, i32);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C3627R.styleable.PlayerControlView_play_icon, i33);
                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(C3627R.styleable.PlayerControlView_pause_icon, i34);
                int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(C3627R.styleable.PlayerControlView_next_icon, i35);
                int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(C3627R.styleable.PlayerControlView_fastforward_icon, i36);
                int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(C3627R.styleable.PlayerControlView_previous_icon, i37);
                int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(C3627R.styleable.PlayerControlView_rewind_icon, i38);
                int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(C3627R.styleable.PlayerControlView_fullscreen_exit_icon, i39);
                int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(C3627R.styleable.PlayerControlView_fullscreen_enter_icon, i41);
                int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(C3627R.styleable.PlayerControlView_repeat_off_icon, i42);
                int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(C3627R.styleable.PlayerControlView_repeat_one_icon, i43);
                int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(C3627R.styleable.PlayerControlView_repeat_all_icon, i44);
                int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(C3627R.styleable.PlayerControlView_shuffle_on_icon, i45);
                int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(C3627R.styleable.PlayerControlView_shuffle_off_icon, i46);
                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(C3627R.styleable.PlayerControlView_subtitle_on_icon, i47);
                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(C3627R.styleable.PlayerControlView_subtitle_off_icon, i48);
                int resourceId17 = typedArrayObtainStyledAttributes.getResourceId(C3627R.styleable.PlayerControlView_vr_icon, i49);
                playerControlView = this;
                try {
                    playerControlView.showTimeoutMs = typedArrayObtainStyledAttributes.getInt(C3627R.styleable.PlayerControlView_show_timeout, playerControlView.showTimeoutMs);
                    playerControlView.repeatToggleModes = getRepeatToggleModes(typedArrayObtainStyledAttributes, playerControlView.repeatToggleModes);
                    boolean z21 = typedArrayObtainStyledAttributes.getBoolean(C3627R.styleable.PlayerControlView_show_rewind_button, true);
                    boolean z22 = typedArrayObtainStyledAttributes.getBoolean(C3627R.styleable.PlayerControlView_show_fastforward_button, true);
                    boolean z23 = typedArrayObtainStyledAttributes.getBoolean(C3627R.styleable.PlayerControlView_show_previous_button, true);
                    boolean z24 = typedArrayObtainStyledAttributes.getBoolean(C3627R.styleable.PlayerControlView_show_next_button, true);
                    boolean z25 = typedArrayObtainStyledAttributes.getBoolean(C3627R.styleable.PlayerControlView_show_shuffle_button, false);
                    boolean z26 = typedArrayObtainStyledAttributes.getBoolean(C3627R.styleable.PlayerControlView_show_subtitle_button, false);
                    boolean z27 = typedArrayObtainStyledAttributes.getBoolean(C3627R.styleable.PlayerControlView_show_vr_button, false);
                    playerControlView.setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(C3627R.styleable.PlayerControlView_time_bar_min_update_interval, playerControlView.timeBarMinUpdateIntervalMs));
                    boolean z28 = typedArrayObtainStyledAttributes.getBoolean(C3627R.styleable.PlayerControlView_animation_enabled, true);
                    typedArrayObtainStyledAttributes.recycle();
                    z16 = z28;
                    i17 = resourceId11;
                    i18 = resourceId12;
                    i19 = resourceId13;
                    i22 = resourceId14;
                    i15 = resourceId15;
                    i23 = resourceId16;
                    i21 = resourceId4;
                    i13 = resourceId17;
                    z11 = z21;
                    z13 = z25;
                    z14 = z26;
                    z15 = z27;
                    i12 = resourceId2;
                    i14 = resourceId;
                    i24 = resourceId5;
                    i25 = resourceId6;
                    i16 = resourceId7;
                    i26 = resourceId9;
                    i27 = resourceId10;
                    z12 = z22;
                    z17 = z24;
                    i28 = resourceId3;
                    i29 = resourceId8;
                    z18 = z23;
                } catch (Throwable th2) {
                    th = th2;
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            i12 = i33;
            playerControlView = this;
            i13 = i49;
            i14 = i32;
            i15 = i47;
            i16 = i38;
            i17 = i43;
            i18 = i44;
            i19 = i45;
            i21 = i35;
            i22 = i46;
            i23 = i48;
            z11 = true;
            z12 = true;
            z13 = false;
            z14 = false;
            z15 = false;
            z16 = true;
            i24 = i36;
            i25 = i37;
            i26 = i41;
            i27 = i42;
            z17 = true;
            i28 = i34;
            i29 = i39;
            z18 = true;
        }
        LayoutInflater.from(context).inflate(i14, playerControlView);
        playerControlView.setDescendantFocusability(262144);
        ComponentListener componentListener = new ComponentListener();
        playerControlView.componentListener = componentListener;
        playerControlView.visibilityListeners = new CopyOnWriteArrayList<>();
        playerControlView.period = new Timeline.Period();
        playerControlView.window = new Timeline.Window();
        StringBuilder sb2 = new StringBuilder();
        playerControlView.formatBuilder = sb2;
        int i51 = i29;
        int i52 = i26;
        playerControlView.formatter = new Formatter(sb2, Locale.getDefault());
        playerControlView.adGroupTimesMs = new long[0];
        playerControlView.playedAdGroups = new boolean[0];
        playerControlView.extraAdGroupTimesMs = new long[0];
        playerControlView.extraPlayedAdGroups = new boolean[0];
        playerControlView.updateProgressAction = new Runnable() { // from class: androidx.media3.ui.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f3555b.updateProgress();
            }
        };
        playerControlView.durationView = (TextView) playerControlView.findViewById(C3627R.id.exo_duration);
        playerControlView.positionView = (TextView) playerControlView.findViewById(C3627R.id.exo_position);
        ImageView imageView = (ImageView) playerControlView.findViewById(C3627R.id.exo_subtitle);
        playerControlView.subtitleButton = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(componentListener);
        }
        ImageView imageView2 = (ImageView) playerControlView.findViewById(C3627R.id.exo_fullscreen);
        playerControlView.fullscreenButton = imageView2;
        initializeFullscreenButton(imageView2, new View.OnClickListener() { // from class: androidx.media3.ui.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3557b.onFullscreenButtonClicked(view);
            }
        });
        ImageView imageView3 = (ImageView) playerControlView.findViewById(C3627R.id.exo_minimal_fullscreen);
        playerControlView.minimalFullscreenButton = imageView3;
        initializeFullscreenButton(imageView3, new View.OnClickListener() { // from class: androidx.media3.ui.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3557b.onFullscreenButtonClicked(view);
            }
        });
        View viewFindViewById = playerControlView.findViewById(C3627R.id.exo_settings);
        playerControlView.settingsButton = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(componentListener);
        }
        View viewFindViewById2 = playerControlView.findViewById(C3627R.id.exo_playback_speed);
        playerControlView.playbackSpeedButton = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(componentListener);
        }
        View viewFindViewById3 = playerControlView.findViewById(C3627R.id.exo_audio_track);
        playerControlView.audioTrackButton = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(componentListener);
        }
        int i53 = C3627R.id.exo_progress;
        TimeBar timeBar = (TimeBar) playerControlView.findViewById(i53);
        View viewFindViewById4 = playerControlView.findViewById(C3627R.id.exo_progress_placeholder);
        if (timeBar != null) {
            playerControlView.timeBar = timeBar;
            context2 = context;
            i31 = i27;
            playerControlView2 = playerControlView;
        } else if (viewFindViewById4 != null) {
            i31 = i27;
            playerControlView2 = this;
            context2 = context;
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context2, null, 0, attributeSet2, C3627R.style.ExoStyledControls_TimeBar);
            defaultTimeBar.setId(i53);
            defaultTimeBar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            playerControlView2.timeBar = defaultTimeBar;
        } else {
            context2 = context;
            i31 = i27;
            playerControlView2 = playerControlView;
            playerControlView2.timeBar = null;
        }
        TimeBar timeBar2 = playerControlView2.timeBar;
        if (timeBar2 != null) {
            timeBar2.addListener(componentListener);
        }
        Resources resources = context2.getResources();
        playerControlView2.resources = resources;
        ImageView imageView4 = (ImageView) playerControlView2.findViewById(C3627R.id.exo_play_pause);
        playerControlView2.playPauseButton = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(componentListener);
        }
        ImageView imageView5 = (ImageView) playerControlView2.findViewById(C3627R.id.exo_prev);
        playerControlView2.previousButton = imageView5;
        if (imageView5 != null) {
            imageView5.setImageDrawable(Util.getDrawable(context2, resources, i25));
            imageView5.setOnClickListener(componentListener);
        }
        ImageView imageView6 = (ImageView) playerControlView2.findViewById(C3627R.id.exo_next);
        playerControlView2.nextButton = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(Util.getDrawable(context2, resources, i21));
            imageView6.setOnClickListener(componentListener);
        }
        Typeface font = ResourcesCompat.getFont(context2, C3627R.font.roboto_medium_numbers);
        ImageView imageView7 = (ImageView) playerControlView2.findViewById(C3627R.id.exo_rew);
        TextView textView = (TextView) playerControlView2.findViewById(C3627R.id.exo_rew_with_amount);
        if (imageView7 != null) {
            imageView7.setImageDrawable(Util.getDrawable(context2, resources, i16));
            playerControlView2.rewindButton = imageView7;
            playerControlView2.rewindButtonTextView = null;
        } else if (textView != null) {
            textView.setTypeface(font);
            playerControlView2.rewindButtonTextView = textView;
            playerControlView2.rewindButton = textView;
        } else {
            playerControlView2.rewindButtonTextView = null;
            playerControlView2.rewindButton = null;
        }
        View view = playerControlView2.rewindButton;
        if (view != null) {
            view.setOnClickListener(playerControlView2.componentListener);
        }
        ImageView imageView8 = (ImageView) playerControlView2.findViewById(C3627R.id.exo_ffwd);
        TextView textView2 = (TextView) playerControlView2.findViewById(C3627R.id.exo_ffwd_with_amount);
        if (imageView8 != null) {
            imageView8.setImageDrawable(Util.getDrawable(context2, resources, i24));
            playerControlView2.fastForwardButton = imageView8;
            playerControlView2.fastForwardButtonTextView = null;
        } else if (textView2 != null) {
            textView2.setTypeface(font);
            playerControlView2.fastForwardButtonTextView = textView2;
            playerControlView2.fastForwardButton = textView2;
        } else {
            playerControlView2.fastForwardButtonTextView = null;
            playerControlView2.fastForwardButton = null;
        }
        View view2 = playerControlView2.fastForwardButton;
        if (view2 != null) {
            view2.setOnClickListener(playerControlView2.componentListener);
        }
        ImageView imageView9 = (ImageView) playerControlView2.findViewById(C3627R.id.exo_repeat_toggle);
        playerControlView2.repeatToggleButton = imageView9;
        if (imageView9 != null) {
            imageView9.setOnClickListener(playerControlView2.componentListener);
        }
        ImageView imageView10 = (ImageView) playerControlView2.findViewById(C3627R.id.exo_shuffle);
        playerControlView2.shuffleButton = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(playerControlView2.componentListener);
        }
        playerControlView2.buttonAlphaEnabled = resources.getInteger(C3627R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        playerControlView2.buttonAlphaDisabled = resources.getInteger(C3627R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        ImageView imageView11 = (ImageView) playerControlView2.findViewById(C3627R.id.exo_vr);
        playerControlView2.vrButton = imageView11;
        if (imageView11 != null) {
            imageView11.setImageDrawable(Util.getDrawable(context2, resources, i13));
            playerControlView2.updateButton(false, imageView11);
        }
        PlayerControlViewLayoutManager playerControlViewLayoutManager = new PlayerControlViewLayoutManager(playerControlView2);
        playerControlView2.controlViewLayoutManager = playerControlViewLayoutManager;
        playerControlViewLayoutManager.setAnimationEnabled(z16);
        SettingsAdapter settingsAdapter = playerControlView2.new SettingsAdapter(new String[]{resources.getString(C3627R.string.exo_controls_playback_speed), playerControlView2.resources.getString(C3627R.string.exo_track_selection_title_audio)}, new Drawable[]{Util.getDrawable(context2, resources, C3627R.drawable.exo_styled_controls_speed), Util.getDrawable(context2, playerControlView2.resources, C3627R.drawable.exo_styled_controls_audiotrack)});
        playerControlView2.settingsAdapter = settingsAdapter;
        playerControlView2.settingsWindowMargin = playerControlView2.resources.getDimensionPixelSize(C3627R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context2).inflate(C3627R.layout.exo_styled_settings_list, (ViewGroup) null);
        playerControlView2.settingsView = recyclerView;
        recyclerView.setAdapter(settingsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(playerControlView2.getContext()));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        playerControlView2.settingsWindow = popupWindow;
        if (Util.SDK_INT < 23) {
            z19 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z19 = false;
        }
        popupWindow.setOnDismissListener(playerControlView2.componentListener);
        playerControlView2.needToHideBars = true;
        playerControlView2.trackNameProvider = new DefaultTrackNameProvider(playerControlView2.getResources());
        playerControlView2.subtitleOnButtonDrawable = Util.getDrawable(context2, playerControlView2.resources, i15);
        playerControlView2.subtitleOffButtonDrawable = Util.getDrawable(context2, playerControlView2.resources, i23);
        playerControlView2.subtitleOnContentDescription = playerControlView2.resources.getString(C3627R.string.exo_controls_cc_enabled_description);
        playerControlView2.subtitleOffContentDescription = playerControlView2.resources.getString(C3627R.string.exo_controls_cc_disabled_description);
        playerControlView2.textTrackSelectionAdapter = new TextTrackSelectionAdapter();
        playerControlView2.audioTrackSelectionAdapter = new AudioTrackSelectionAdapter();
        playerControlView2.playbackSpeedAdapter = playerControlView2.new PlaybackSpeedAdapter(playerControlView2.resources.getStringArray(C3627R.array.exo_controls_playback_speeds), PLAYBACK_SPEEDS);
        playerControlView2.playButtonDrawable = Util.getDrawable(context2, playerControlView2.resources, i12);
        playerControlView2.pauseButtonDrawable = Util.getDrawable(context2, playerControlView2.resources, i28);
        playerControlView2.fullscreenExitDrawable = Util.getDrawable(context2, playerControlView2.resources, i51);
        playerControlView2.fullscreenEnterDrawable = Util.getDrawable(context2, playerControlView2.resources, i52);
        playerControlView2.repeatOffButtonDrawable = Util.getDrawable(context2, playerControlView2.resources, i31);
        playerControlView2.repeatOneButtonDrawable = Util.getDrawable(context2, playerControlView2.resources, i17);
        playerControlView2.repeatAllButtonDrawable = Util.getDrawable(context2, playerControlView2.resources, i18);
        playerControlView2.shuffleOnButtonDrawable = Util.getDrawable(context2, playerControlView2.resources, i19);
        playerControlView2.shuffleOffButtonDrawable = Util.getDrawable(context2, playerControlView2.resources, i22);
        playerControlView2.fullscreenExitContentDescription = playerControlView2.resources.getString(C3627R.string.exo_controls_fullscreen_exit_description);
        playerControlView2.fullscreenEnterContentDescription = playerControlView2.resources.getString(C3627R.string.exo_controls_fullscreen_enter_description);
        playerControlView2.repeatOffButtonContentDescription = playerControlView2.resources.getString(C3627R.string.exo_controls_repeat_off_description);
        playerControlView2.repeatOneButtonContentDescription = playerControlView2.resources.getString(C3627R.string.exo_controls_repeat_one_description);
        playerControlView2.repeatAllButtonContentDescription = playerControlView2.resources.getString(C3627R.string.exo_controls_repeat_all_description);
        playerControlView2.shuffleOnContentDescription = playerControlView2.resources.getString(C3627R.string.exo_controls_shuffle_on_description);
        playerControlView2.shuffleOffContentDescription = playerControlView2.resources.getString(C3627R.string.exo_controls_shuffle_off_description);
        playerControlView2.controlViewLayoutManager.setShowButton((ViewGroup) playerControlView2.findViewById(C3627R.id.exo_bottom_bar), true);
        playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.fastForwardButton, z12);
        playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.rewindButton, z11);
        playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.previousButton, z18);
        playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.nextButton, z17);
        playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.shuffleButton, z13);
        playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.subtitleButton, z14);
        playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.vrButton, z15);
        playerControlView2.controlViewLayoutManager.setShowButton(playerControlView2.repeatToggleButton, playerControlView2.repeatToggleModes != 0 ? true : z19);
        playerControlView2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.media3.ui.h
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view3, int i54, int i55, int i56, int i57, int i58, int i59, int i61, int i62) {
                this.f3558b.onLayoutChange(view3, i54, i55, i56, i57, i58, i59, i61, i62);
            }
        });
    }
}
