p a c k a g e   c o m . m l d n . l x h . d e m o ;  
 i m p o r t   j a v a . u t i l . H a s h M a p ;  
 i m p o r t   j a v a . u t i l . M a p ;  
 p u b l i c   c l a s s   R e g i s t e r   {  
 p r i v a t e   S t r i n g   n a m e ;  
 p r i v a t e   S t r i n g   a g e ;  
 p r i v a t e   S t r i n g   e m a l l ;  
 p r i v a t e   M a p < S t r i n g ,   S t r i n g >   e r r o r s   =   n u l l ;  
 p u b l i c   R e g i s t e r ( )   {  
 	 t h i s . n a m e   =   " " ;  
 	 t h i s . a g e   =   " " ;  
 	 t h i s . e m a l l   =   " " ;  
 	 t h i s . e r r o r s   =   n e w   H a s h M a p < S t r i n g ,   S t r i n g > ( ) ;  
 }  
 p u b l i c   b o o l e a n   i s V a l i d a t e ( )   {  
 	 b o o l e a n   f l a g   =   t r u e ;  
 	 i f ( ! t h i s . n a m e . m a t c h e s ( " \ \ w { 6 . 1 5 } " ) )   {  
 	 	 f l a g   =   f a l s e ;  
 	 	 t h i s . n a m e   =   " " ;  
 	 	 t h i s . e r r o r s . p u t ( " e r r n a m e " ,   " (u7bT:N6 0R1 5 *NpeW[bW[�k" ) ;  
 	 }      
 	 i f ( ! t h i s . a g e . m a t c h e s ( " \ \ d + " ) )   {  
 	 	 f l a g   =   f a l s e ;  
 	 	 t h i s . a g e   =   " " ;  
 	 	 t h i s . e r r o r s . p u t ( " e r r a g e " ,   " t^���S��:NpeW[" ) ;  
 	 }  
 	 i f ( ! t h i s . e m a l l . m a t c h e s ( " \ \ w + @ \ \ w + \ \ . \ \ w + \ \ . ? \ \ w * " ) )   {  
 	 	 f l a g   =   f a l s e ;  
 	 	 t h i s . e m a l l   =   " " ;  
 	 	 t h i s . e r r o r s . p u t ( " e r r e m a l l " ,   " N/f	gHe�v5uP[���N0W@W" ) ;  
 	 }  
 	 r e t u r n   f l a g ;  
 }  
 	 p u b l i c   S t r i n g   g e t E r r o r M s g ( S t r i n g   k e y )   {  
 	 	 S t r i n g   v a l u e   =   t h i s . e r r o r s . g e t ( k e y ) ;  
 	 	 r e t u r n   v a l u e   = =   n u l l ?   " " : v a l u e ;  
 	 }  
 	  
 	 p u b l i c   S t r i n g   g e t N a m e ( )   {  
 	 	 r e t u r n   t h i s . n a m e ;  
 	 }  
 	 p u b l i c   v o i d   s e t N a m e ( S t r i n g   n a m e )   {  
 	 	 t h i s . n a m e   =   n a m e ;  
 	 }  
 	 p u b l i c   S t r i n g   g e t A g e ( )   {  
 	 	 r e t u r n   t h i s . a g e ;  
 	 }  
 	 p u b l i c   v o i d   s e t A g e ( S t r i n g   a g e )   {  
 	 	 t h i s . a g e   =   a g e ;  
 	 }  
 	 p u b l i c   S t r i n g   g e t E m a l l ( )   {  
 	 	 r e t u r n   t h i s . e m a l l ;  
 	 }  
 	 p u b l i c   v o i d   s e t E m a l l ( S t r i n g   e m a l l )   {  
 	 	 t h i s . e m a l l   =   e m a l l ;  
 	 }  
 }  
 