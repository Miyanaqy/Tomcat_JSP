p a c k a g e   c o m . l i n . t a g ;  
 i m p o r t   j a v a x . s e r v l e t . j s p . t a g e x t . T a g D a t a ;  
 i m p o r t   j a v a x . s e r v l e t . j s p . t a g e x t . T a g E x t r a I n f o ;  
 i m p o r t   j a v a x . s e r v l e t . j s p . t a g e x t . V a r i a b l e I n f o ;  
 p u b l i c   c l a s s   B o d y I t e r a t e T a g E x t r a I n f o   e x t e n d s   T a g E x t r a I n f o {  
 	 p u b l i c   V a r i a b l e I n f o [ ]   g e t V a r i a b l e I n f o ( T a g D a t a   d a t a )   {  
 	 	 r e t u r n   n e w   V a r i a b l e I n f o [ ]   { n e w   V a r i a b l e I n f o ( d a t a . g e t I d ( ) ,   " j a v a . l a n g . S t r i n g " ,   t r u e ,   V a r i a b l e I n f o . N E S T E D ) } ;  
 	 }  
 }  
 