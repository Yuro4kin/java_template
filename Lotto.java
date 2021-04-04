 	import javax.swing.* ;														//  1	import of all classes of Swing
//	import java.awt.* ; 
	import java.awt.event.* ; 
	
	 	 class Lotto extends JFrame implements ActionListener {				//  2   create class -JFrame-, with adding an interface ActionListener  	
																				
						       JPanel pnl = new JPanel();								//  3   create container JPanel - window component

							   ClassLoader ldr = this.getClass().getClassLoader() ;										//  3   create  ClassLoader - Lotto component
							   java.net.URL iconURL = ldr.getResource ("Lotto.png" ) ;	//	3	create  object AudioClip and download file with object ClassLoader
							   ImageIcon icon = new ImageIcon ( iconURL) ;
							   JLabel img = new JLabel( icon ) ;
							   JTextField txt = new JTextField("" , 14 ) ;	
							   JButton btn = new JButton("Show happy numbers");				//  3   create  JButton - Lotto component 
							   
					public Lotto() {											//  4   add constructor with parameters Statess, add JPanel in class JFrame
							   super( "Application - Lotto" ) ;						//  4   smaller components
							// setTitle("Hello World") ; 						//  4   smaller components
							   setSize( 280 , 280 ) ;							//  4   smaller components
				               setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ) ;		//  4   smaller components
							   add( pnl ) ;										//  4   smaller components
							   setVisible(true) ;								//  4   smaller components

							   pnl.add( img ) ;								//	4	add buttons to the JPanel container
							   pnl.add( txt ) ;								//	4	add buttons to the JPanel container
							   pnl.add( btn ) ;								//	4	add buttons to the JPanel container

							   btn.addActionListener( this ) ;					//	4	insert statements to generate the ActionEvent for every button	   
					}

					public void actionPerformed ( ActionEvent event ) {					//	7	add an ActionEvent that acknowledges when a button gets pressed  
								
								if ( event.getSource() == btn ) {
	
									// declare and initialize a variable of array integer random 1...49 = 50 elements
									int [] nums = new int[50] ; String str = "" ;
									for (int i = 1 ; i < 50 ; i++ )  {
										nums[i] = i ;
									}  

									for (int i = 1 ; i < 50 ; i++ )  {
									int r = (int) Math.ceil (Math.random() * 49) ;
									int temp = nums[i] ;
									nums[i] = nums[r] ;
									nums[r] = temp ;
									}  	

									for (int i = 1 ; i < 7 ; i++ ) {
										 str += " " + Integer.toString(nums[i]) + "  " ; 
									}
										txt.setText( str ) ;
								}  	
					}

									
					public static void main ( String[] args ) {					//	  5   create method main
					 		   Lotto lotto = new Lotto() ;						//	  6   create an instance of the class Lotto with adding a line to the main method
					}

}



		
		 
		 	//			downlod .wav
			//				^
			//		  ClassLoader - class								
			//				^					  			
			//	 	getSource()	- object					
			//				^					  			
			//		getResource() - methods				  					play(), stop() - method
			//				^					  								^
			//	newAudioClip ()	<==			method			<==		JPanel , JButton - components 
			//									  ^								^
			//				 			class -	JApplet 		<==	interface ActionListener
		 	//									  ^
			//					 		java.applet.AudioClip -  package
			//									  ^
			//					  				Swing
		 
		 
		 
		 

	

				


	


			

	





