/*
 *				Twidere - Twitter client for Android
 * 
 * Copyright (C) 2012 Mariotaku Lee <mariotaku.lee@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.mariotaku.twidere.model;

import org.mariotaku.twidere.R;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class UserListViewHolder {

	public final ImageView profile_image;
	public final TextView name, description, owner;
	private final View gap_indicator;
	public boolean show_as_gap;
	private float text_size;

	public UserListViewHolder(View view) {
		gap_indicator = view.findViewById(R.id.list_gap_text);
		profile_image = (ImageView) view.findViewById(R.id.profile_image);
		name = (TextView) view.findViewById(R.id.name);
		description = (TextView) view.findViewById(R.id.description);
		owner = (TextView) view.findViewById(R.id.owner);
	}

	public void setShowAsGap(boolean show_gap) {
		show_as_gap = show_gap;
		profile_image.setVisibility(show_gap ? View.GONE : View.VISIBLE);
		name.setVisibility(show_gap ? View.GONE : View.VISIBLE);
		description.setVisibility(show_gap ? View.GONE : View.VISIBLE);
		owner.setVisibility(show_gap ? View.GONE : View.VISIBLE);
		gap_indicator.setVisibility(!show_gap ? View.GONE : View.VISIBLE);
	}

	public void setTextSize(float text_size) {
		if (this.text_size != text_size) {
			this.text_size = text_size;
			description.setTextSize(text_size);
			name.setTextSize(text_size * 1.05f);
			owner.setTextSize(text_size * 0.65f);
		}
	}

}
