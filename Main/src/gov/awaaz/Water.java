package gov.awaaz;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Water extends Activity
{
   public void onCreate(Bundle icicle)
   {
      super.onCreate(icicle);
      setContentView(R.layout.water);
      Button b = (Button) findViewById(R.id.button7);
      b.setOnClickListener(new View.OnClickListener() {
         public void onClick(View arg0) {
         setResult(RESULT_OK);
         finish();
         }
      });
   }
}