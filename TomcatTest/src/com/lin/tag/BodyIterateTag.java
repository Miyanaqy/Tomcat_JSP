p a c k a g e   c o m . l i n . t a g ;  
  
 i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 i m p o r t   j a v a . u t i l . I t e r a t o r ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
 i m p o r t   j a v a x . s e r v l e t . j s p . J s p E x c e p t i o n ;  
 i m p o r t   j a v a x . s e r v l e t . j s p . P a g e C o n t e x t ;  
 i m p o r t   j a v a x . s e r v l e t . j s p . t a g e x t . B o d y T a g S u p p o r t ;  
 p u b l i c   c l a s s   B o d y I t e r a t e T a g   e x t e n d s   B o d y T a g S u p p o r t {  
 	 p r i v a t e   S t r i n g   n a m e ;  
 	 p u b l i c   S t r i n g   g e t N a m e ( )   {  
 	 	 r e t u r n   n a m e ;  
 	 }  
 	 p u b l i c   v o i d   s e t N a m e ( S t r i n g   n a m e )   {  
 	 	 t h i s . n a m e   =   n a m e ;  
 	 }  
 	 p u b l i c   S t r i n g   g e t S c o p e ( )   {  
 	 	 r e t u r n   s c o p e ;  
 	 }  
 	 p u b l i c   v o i d   s e t S c o p e ( S t r i n g   s c o p e )   {  
 	 	 t h i s . s c o p e   =   s c o p e ;  
 	 }  
 	 p u b l i c   S t r i n g   g e t I d ( )   {  
 	 	 r e t u r n   i d ;  
 	 }  
 	 p u b l i c   v o i d   s e t I d ( S t r i n g   i d )   {  
 	 	 t h i s . i d   =   i d ;  
 	 }  
 	 p r i v a t e   S t r i n g   s c o p e ;  
 	 p r i v a t e   S t r i n g   i d ;  
 	 p r i v a t e   I t e r a t o r < ? >   i t e r ;  
 	 p u b l i c   i n t   d o S t a r t T a g ( )   t h r o w s   J s p E x c e p t i o n {  
 	 	 O b j e c t   v a l u e   =   n u l l ;  
 	 	 i f ( " p a g e " . e q u a l s ( t h i s . s c o p e ) )   {  
 	 	 	 v a l u e   =   s u p e r . p a g e C o n t e x t . g e t A t t r i b u t e ( n a m e ,   p a g e C o n t e x t . P A G E _ S C O P E ) ;  
 	 	 } e l s e   i f ( " r e q u e s t " . e q u a l s ( t h i s . s c o p e ) )   {  
 	 	 	 v a l u e   =   s u p e r . p a g e C o n t e x t . g e t A t t r i b u t e ( n a m e ,   p a g e C o n t e x t . R E Q U E S T _ S C O P E ) ;  
 	 	 } e l s e   i f ( " s e s s i o n " . e q u a l s ( t h i s . s c o p e ) )   {  
 	 	 	 v a l u e   =   s u p e r . p a g e C o n t e x t . g e t A t t r i b u t e ( n a m e ,   p a g e C o n t e x t . S E S S I O N _ S C O P E ) ;  
 	 	 } e l s e   {  
 	 	 	 v a l u e   =   s u p e r . p a g e C o n t e x t . g e t A t t r i b u t e ( n a m e ,   p a g e C o n t e x t . A P P L I C A T I O N _ S C O P E ) ;  
 	 	 }  
 	 	 i f ( v a l u e   ! =   n u l l   & &   v a l u e   i n s t a n c e o f   L i s t < ? > )   {  
 	 	 	 t h i s . i t e r   =   ( ( L i s t < ? > ) v a l u e ) . i t e r a t o r ( ) ;  
 	 	 	 i f ( i t e r . h a s N e x t ( ) )   {  
 	 	 	 	 s u p e r . p a g e C o n t e x t . s e t A t t r i b u t e ( i d ,   i t e r . n e x t ( ) ) ;  
 	 	 	 	 r e t u r n   B o d y T a g S u p p o r t . E V A L _ B O D Y _ B U F F E R E D ;  
 	 	 	 } e l s e   {  
 	 	 	 	 r e t u r n   B o d y T a g S u p p o r t . S K I P _ B O D Y ;  
 	 	 	 }  
 	 	 } e l s e   {  
 	 	 	 r e t u r n   B o d y T a g S u p p o r t . S K I P _ B O D Y ;  
 	 	 }  
 	 }  
 	 p u b l i c   i n t   d o A f t e r B o d y ( )   t h r o w s   J s p E x c e p t i o n {  
 	 	 i f ( i t e r . h a s N e x t ( ) )   {  
 	 	 	 s u p e r . p a g e C o n t e x t . s e t A t t r i b u t e ( i d ,   i t e r . n e x t ( ) ) ;  
 	 	 	 r e t u r n   B o d y T a g S u p p o r t . E V A L _ B O D Y _ A G A I N ;  
 	 	 } e l s e   {  
 	 	 	 r e t u r n   B o d y T a g S u p p o r t . S K I P _ B O D Y ;  
 	 	 }  
 	 }  
 	 p u b l i c   i n t   d o E n d T a g ( )   t h r o w s   J s p E x c e p t i o n {  
 	 	 i f ( s u p e r . b o d y C o n t e n t   ! =   n u l l )   {  
 	 	 	 t r y   {  
 	 	 	 	 s u p e r . b o d y C o n t e n t . w r i t e O u t ( s u p e r . g e t P r e v i o u s O u t ( ) ) ;  
 	 	 	 } c a t c h ( I O E x c e p t i o n   e )   {  
 	 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 	 }  
 	 	 }  
 	 	 r e t u r n   B o d y T a g S u p p o r t . E V A L _ P A G E ;  
 	 }  
 	  
 }  
 