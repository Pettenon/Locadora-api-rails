package br.com.rubythree.cotia.locadora;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowActivity extends Activity {
	@Override
	protected void onCreate (Bundle savedInstanceState){
		super.onCreate (savedInstanceState);
		setContentView (R.layout.third);

		Bundle extras = getIntent().getExtras();
		String name = extras.getString ("name");
		String genre = extras.getString ("genre");
		
		TextView nameTextView = (TextView) findViewById (R.id.name);
		TextView genreTextView = (TextView) findViewById (R.id.genre);
		
		nameTextView.setText (getString (R.string.movie_name, name));
		genreTextView.setText (getString (R.string.movie_genre, genre));
	}
}
