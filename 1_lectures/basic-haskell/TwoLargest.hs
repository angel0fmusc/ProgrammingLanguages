module TwoLargest where

getTwoLargest :: (Ord a) => [a] -> (a,a)

getTwoLargest []  = error "list empty"
getTwoLargest [x] = error "list contains only one element"

getTwoLargest (x0:x1:xs)  
  | x0 >= x1   = getTwoLargest_iter (x0,x1) xs
  | otherwise  = getTwoLargest_iter (x1,x0) xs

updateTwoLargest :: (Ord a) => (a,a) -> a -> (a,a)
updateTwoLargest (x0,x1) y =
  if y >= x0 
    then (y,x0)
    else if y >= x1 
      then (x0,y)
      else (x0,x1)       

getTwoLargest_iter :: (Ord a) => (a,a) -> [a] -> (a,a)
getTwoLargest_iter result [] = result
getTwoLargest_iter (x0,x1) (y:ys) =
  getTwoLargest_iter (updateTwoLargest (x0,x1) y) ys